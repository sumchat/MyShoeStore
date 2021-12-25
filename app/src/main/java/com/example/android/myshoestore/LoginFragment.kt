package com.example.android.myshoestore

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.android.myshoestore.databinding.FragmentLoginBinding
import android.util.Log
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer


/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {

    private lateinit var viewModel:LogInViewModel
    private lateinit var binding: FragmentLoginBinding
    private val sharedviewModel: LogInViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setHasOptionsMenu(false)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_login, container, false)
       // val binding:FragmentLoginBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false)
      //  binding.loginbutton.setOnClickListener {v: View -> v.findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())}

         binding = DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false)

        //binding.loginbutton.setOnClickListener { v:View-> v.findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())  }
        binding.loginbutton.setOnClickListener { v:View-> logIn()  }

        binding.registerbutton.setOnClickListener { v:View -> register() }


       // binding.loginbutton.setOnClickListener {v: View -> v.findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())}

       // binding.loginbutton.setOnClickListener { logIn()}

       // viewModel = ViewModelProvider(this).get(LogInViewModel::class.java)
        val activity = this.activity as MainActivity?
       /* if (activity != null) {
            viewModel = activity.viewModel
        }*/
         viewModel = sharedviewModel

      //  viewModel = ViewModelProvider(requireActivity()).get(LogInViewModel::class.java)
       // viewModel = ViewModelProvider(requireActivity()).get(LogInViewModel::class.java)

            viewModel.isLoggedIn.observe(viewLifecycleOwner, Observer { loggedin ->
                if (loggedin) {
                    findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())


                } else {
                    var wrongusername = binding.textView7
                    wrongusername.visibility = View.VISIBLE
                }
            })

       /* val activity = this.activity as MainActivity?

        if (activity != null) {
            activity.enableDisableDrawer(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
        }*/
        return binding.root
    }

    private fun Validate(): Boolean {
        if (binding.editTextTextPersonName2.text.isEmpty()) return false
        if (binding.editTextTextPassword2.text.isEmpty()) return false
        return true

    }

    fun logIn() {
        var _userName = binding.editTextTextPersonName2
        var _password = binding.editTextTextPassword2
        var wrongusername = binding.textView9

       // _userName.text.isNotEmpty().apply{
        if(Validate()){




              viewModel.logIn(_userName.text.toString(), _password.text.toString())


        }
        else {
            var wrongusername = binding.textView7
            wrongusername.visibility = View.VISIBLE
        }

    }

    fun register() {
        var _userName:Editable = binding.editTextTextPersonName2.text
        var _password:Editable = binding.editTextTextPassword2.text

        if(Validate()){



                viewModel.register(_userName.toString(), _password.toString())

           // if(viewModel.isLoggedIn.value == true)
           //     findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())
        }
        else {
            var wrongusername = binding.textView7
            wrongusername.visibility = View.VISIBLE
        }

    }



}