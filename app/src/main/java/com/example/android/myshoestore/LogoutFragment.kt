package com.example.android.myshoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController

import com.example.android.myshoestore.databinding.FragmentLogoutBinding


class LogoutFragment : Fragment() {
    private lateinit var binding: FragmentLogoutBinding
    private lateinit var viewModel:LogInViewModel

    private val sharedviewModel: LogInViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_logout, container, false)

         binding = DataBindingUtil.inflate(inflater, R.layout.fragment_logout, container, false)
        viewModel = sharedviewModel
        binding.loginviewModel = viewModel
        binding.logmeout.setOnClickListener { v:View->
            viewModel.logOut()
            v.findNavController().navigate(LogoutFragmentDirections.actionLogoutFragmentToLoginFragment())
        }


        return binding.root

    }


}