package com.example.android.myshoestore

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController


import com.esri.arcgisruntime.ArcGISRuntimeEnvironment
import com.esri.arcgisruntime.mapping.ArcGISMap
import com.esri.arcgisruntime.mapping.BasemapStyle
import com.esri.arcgisruntime.mapping.Viewpoint
import com.esri.arcgisruntime.mapping.view.LocationDisplay
import com.esri.arcgisruntime.mapping.view.MapView
import com.esri.arcgisruntime.portal.Portal
import com.esri.arcgisruntime.portal.PortalItem
import com.example.android.myshoestore.databinding.FragmentInstructionBinding

//import com.example.android.myshoestore.databinding




/**
 * A simple [Fragment] subclass.
 * Use the [InstructionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class InstructionFragment : Fragment() {
    // TODO: Rename and change types of parameters
    //private lateinit var binding:FragmentInstructionBinding
   // private val locationDisplay: LocationDisplay by lazy { mapView.locationDisplay }


    private val activityMainBinding by lazy {
        FragmentInstructionBinding.inflate(layoutInflater)
    }

    private val mapView: MapView by lazy {
        activityMainBinding.mapView
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //activityMainBinding.
       // return inflater.inflate(R.layout.fragment_instruction, container, false)
       //var binding : ViewDataBinding? = DataBindingUtil.inflate(inflater,R.layout.fragment_instruction,container,false)
        setApiKeyForApp()

        setupMap()
        // binding.loginbutton.setOnClickListener {v: View -> v.findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())}
        activityMainBinding.myshoelist.setOnClickListener { v:View -> v.findNavController().navigate(InstructionFragmentDirections.actionInstructionFragmentToMyShoeListFragment2()) }
        return activityMainBinding.root


    }

    private fun setupMap() {

        // create a map with the BasemapStyle streets
        //val map = ArcGISMap(BasemapStyle.ARCGIS_TOPOGRAPHIC)

        // set the map to be displayed in the layout's MapView
       // mapView.map = map
//
        val portal = Portal("https://www.arcgis.com", false)

        val itemId = "4ab2c027c1a14ca0b67ede51c7bcf606"
        val portalItem = PortalItem(portal, itemId)
        val map = ArcGISMap(portalItem)

        mapView.map = map

        // set the viewpoint, Viewpoint(latitude, longitude, scale)
            //  mapView.setViewpoint(Viewpoint(34.0270, -118.8050, 72000.0))



    }

    private fun setApiKeyForApp(){
        // set your API key
        // Note: it is not best practice to store API keys in source code. The API key is referenced
        // here for the convenience of this tutorial.

        ArcGISRuntimeEnvironment.setApiKey("AAPK149ae920390b48c0b654a648850914d7W3ehdaiUusJieDoBWWSTs0uwNdPGpNNIwjSEMbHmEG3l1drVT8gq3qI3Ii-LRNJE")

    }
    override fun onPause() {
        mapView.pause()
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
        mapView.resume()
    }

    override fun onDestroy() {
        mapView.dispose()
        super.onDestroy()
    }
}