package com.example.android.myshoestore

import android.content.Context
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.Intent
import android.util.Log
import android.widget.*
import androidx.navigation.findNavController
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.android.myshoestore.data.Shoe
import com.example.android.myshoestore.databinding.FragmentShoeDetailBinding


class ShoeDetailFragment : Fragment() {
    private lateinit var viewOfLayout: View
    lateinit var thiscontext: Context
    private lateinit var binding:FragmentShoeDetailBinding
    private  var shoeId:Long = 0

    private val shoeDetailViewModel by viewModels<ShoeDetailViewModel> {
        ShoeDetailViewModelFactory(thiscontext)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_shoe_detail,container,false)
       // viewOfLayout = inflater.inflate(R.layout.fragment_shoe_detail, container, false)
        if (container != null) {
            thiscontext = container.getContext()
        }
       // val sizes = resources.getStringArray(R.array.Size)
        val spinner = binding.sizespinner
        val adapter = ArrayAdapter.createFromResource(thiscontext,R.array.Size,android.R.layout.simple_spinner_item)

        spinner.adapter = adapter
        var args = ShoeDetailFragmentArgs.fromBundle(requireArguments())
        shoeId = args.shoeId
        // Get the Intent that started this activity and extract the string
       /* var activity = getActivity()
        if(activity !== null) {
            val message: String? = activity.intent.getStringExtra(SHOE_ID)
            if (message != null) {
               shoeId = message.toLong()
            }

        }*/

        /* Connect variables to UI elements. */
        val shoeName: TextView = binding.shoeNameEdit//findViewById(R.id.shoeNameEdit)
        val companyName:TextView = binding.editTextCompanyName
        val shoeImage: ImageView = binding.shoeImage//findViewById(R.id.flower_detail_image)
        val shoeDescription: TextView = binding.editTextMultiLineDescription//findViewById(R.id.flower_detail_description)
        var shoeSize = 10

        spinner.onItemSelectedListener = object:AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val size = parent?.getItemAtPosition(position).toString()
                shoeSize = size.toInt()
            }
        }


        shoeId?.let{
            var currentShoe = shoeDetailViewModel.getShoeForId(shoeId)
            shoeName.text = currentShoe?.name
            companyName.text = currentShoe?.companyName
            shoeDescription.text = currentShoe?.description
            val spinnerPosition = adapter.getPosition(currentShoe?.size.toString())
            spinner.setSelection(spinnerPosition)
            if(currentShoe?.image == null)
                shoeImage.setImageResource(R.mipmap.shoeicon_foreground)
            else
                shoeImage.setImageResource(currentShoe.image!!)
        }
         binding.savebtn.setOnClickListener{v:View -> addShoe()}
        binding.cancelbtn.setOnClickListener{v:View -> v.findNavController().navigate(ShoeDetailFragmentDirections.actionShoeDetailFragmentToMyShoeListFragment())}
        //binding.registerbutton.setOnClickListener { v:View -> register() }
        return binding.root
        //return inflater.inflate(R.layout.fragment_shoe_detail, container, false)
    }
    ///add new shoe

    fun addShoe()
    {
        val id = shoeId
        val name = binding.shoeNameEdit.text
        val _companyName = binding.editTextCompanyName.text
        val description = binding.editTextMultiLineDescription.text
        val size =  binding.sizespinner.getSelectedItem().toString();
        Log.i("shoeDetail", name.toString())
        var isSaved = true
        try {

            shoeDetailViewModel.saveShoe(
                id,
                name.toString(),
                _companyName.toString(),
                size.toInt(),
                description.toString()
            )

        }
        catch(e:Exception)
        {
            isSaved = false
            Toast.makeText(context,
                "Error while saving",
                Toast.LENGTH_LONG).show()
        }
        if(isSaved)
            findNavController().navigate(ShoeDetailFragmentDirections.actionShoeDetailFragmentToMyShoeListFragment())

    }

}