package com.example.android.myshoestore

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.RecyclerView
import com.example.android.myshoestore.data.Shoe

const val SHOE_ID = "shoe id"
class MyShoeListFragment : Fragment() {
    lateinit var thiscontext: Context
    private lateinit var viewModel:LogInViewModel
  //  lateinit var shoes: List<Shoe>

   // private lateinit var viewModel: ShoeListViewModel
    //private lateinit var viewModelFactory: ShoeListViewModelFactory
    private lateinit var viewOfLayout: View

    private val sharedviewModel: LogInViewModel by activityViewModels()

    /* Opens FlowerDetailActivity when RecyclerView item is clicked. */
    private fun adapterOnClick(shoe: Shoe) {
       // val intent = Intent(thiscontext, ShoeDetailFragment()::class.java)
       // intent.putExtra(SHOE_ID, shoe.id)
       // startActivity(intent)
      this.findNavController().navigate(MyShoeListFragmentDirections.actionMyShoeListFragmentToShoeDetailFragment2(shoe.id))
       // findNavController().navigate(MyShoeListFragmentDirections.actionMyShoeListFragmentToShoeDetailFragment(shoe.id))
    }

    private val shoeListViewModel by viewModels<ShoeListViewModel> {
        ShoeListViewModelFactory(thiscontext)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       // shoes = shoeListViewModel.shoesLiveData.value!!




    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        if (container != null) {
            thiscontext = container.getContext()
        }
        viewOfLayout = inflater.inflate(R.layout.fragment_my_shoe_list, container, false)

        viewModel = sharedviewModel

        val _shoeAdapter = ShoeAdapter{ shoe -> adapterOnClick(shoe)}
        val recyclerView: RecyclerView = viewOfLayout.findViewById(R.id.recycler_view)//findViewById(R.id.recycler_view)
        recyclerView.adapter = _shoeAdapter
        shoeListViewModel.shoesLiveData.observe(viewLifecycleOwner, {
            it?.let {
                _shoeAdapter.submitList(it as MutableList<Shoe>)
                //headerAdapter.updateFlowerCount(it.size)
            }
        })
        var shoeslist = shoeListViewModel.shoesLiveData.value


       // val minObject: Shoe? = shoeslist?.minByOrNull{ it.id }
        val maxObject: Shoe? = shoeslist?.maxByOrNull{ it.id }
        var maxId:Long = -1
        if(maxObject != null)
         maxId = maxObject?.id
        setHasOptionsMenu(true)


        val fab:View = viewOfLayout.findViewById(R.id.fab)
        fab.setOnClickListener{v:View -> v.findNavController().navigate(MyShoeListFragmentDirections.actionMyShoeListFragmentToShoeDetailFragment2(maxId.plus(1)))}

        return viewOfLayout
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.overflow_menu,menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        viewModel.logOut()
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }


}