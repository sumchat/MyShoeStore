package com.example.android.myshoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController

import com.example.android.myshoestore.databinding.FragmentLogoutBinding


class LogoutFragment : Fragment() {
    private lateinit var binding: FragmentLogoutBinding

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

        binding.logmeout.setOnClickListener { v:View-> v.findNavController().navigate(LogoutFragmentDirections.actionLogoutFragmentToLoginFragment())  }

        return binding.root

    }


}