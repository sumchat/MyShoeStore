package com.example.android.myshoestore.data

import android.content.res.Resources
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class DataSource(resources: Resources) {
    private val shoeList = shoeList(resources)
    private val shoesLiveData = MutableLiveData(shoeList)

    fun updateShoe(shoe:Shoe){
        val currentList = shoesLiveData.value
        if(currentList != null) {
            val updatedList = currentList.toMutableList()
            //First, find the position of the shoe in the list
            val shoePosition = updatedList.indexOfFirst {
                it.id == shoe.id

            }


            //Now get your shoe by position and make changes
            val updatedShoe = updatedList[shoePosition].apply {
                //Make all changes you need here
                name = shoe.name
                companyName = shoe.companyName
                size = shoe.size
                description = shoe.description

                //...
            }

            //Finally, replace updated video into your list.
            updatedList[shoePosition] = updatedShoe
            shoesLiveData.postValue(updatedList)
        }
    }

    fun addShoe(shoe: Shoe) {
        val currentList = shoesLiveData.value
        if (currentList == null) {
            shoesLiveData.postValue(listOf(shoe))
        } else {
            val updatedList = currentList.toMutableList()
            updatedList.add(0, shoe)
            shoesLiveData.postValue(updatedList)
        }
    }
    /* Returns flower given an ID. */
    fun getShoeForId(id: Long): Shoe? {
        shoesLiveData.value?.let { shoeList ->
            return shoeList.firstOrNull{ it.id == id}
        }
        return null
    }

    /* Returns a random flower asset for flowers that are added. */
    fun getRandomShoeImageAsset(): Int? {
        val randomNumber = (shoeList.indices).random()
        return shoeList[randomNumber].image
    }

    fun getShoeList(): LiveData<List<Shoe>> {
        return shoesLiveData
    }
    companion object {
        private var INSTANCE: DataSource? = null

        fun getDataSource(resources: Resources): DataSource {
            return synchronized(DataSource::class) {
                val newInstance = INSTANCE ?: DataSource(resources)
                INSTANCE = newInstance
                newInstance
            }
        }
    }
}