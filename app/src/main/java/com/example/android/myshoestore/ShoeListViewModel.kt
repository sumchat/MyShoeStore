package com.example.android.myshoestore

import androidx.lifecycle.ViewModel
import com.example.android.myshoestore.data.DataSource
import com.example.android.myshoestore.data.Shoe
import kotlin.random.Random

class ShoeListViewModel(val dataSource:DataSource): ViewModel() {
   val shoesLiveData = dataSource.getShoeList()
    fun insertShoe(shoeName:String?,companyName:String,shoeDescription:String?,size:Int){
        if (shoeName == null || shoeDescription == null) {
            return
        }
        val image = dataSource.getRandomShoeImageAsset()
        val newShoe = Shoe(Random.nextLong(),shoeName,companyName,size,image,shoeDescription)
        dataSource.addShoe(newShoe)
    }
}