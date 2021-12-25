package com.example.android.myshoestore

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.myshoestore.data.DataSource
import com.example.android.myshoestore.data.Shoe
import kotlin.random.Random

class ShoeDetailViewModel(private val dataSource: DataSource) : ViewModel() {
    /* Queries datasource to returns a flower that corresponds to an id. */
    fun getShoeForId(id: Long) : Shoe? {
        return dataSource.getShoeForId(id)
    }

    fun saveShoe(_id:Long,name:String,companyName:String,size:Int,description:String){
        var _shoe = getShoeForId(_id)
        if(_shoe != null)
        {
            var _shoe:Shoe = Shoe(_id,name.toString(),companyName.toString(),size.toInt(),null, description.toString())


            dataSource.updateShoe(_shoe)
        }
        else
        {
            var _shoe:Shoe = Shoe(_id,name.toString(),companyName.toString(),size.toInt(),null, description.toString())


            dataSource.addShoe(_shoe)
        }
    }

    /*fun updateShoe(shoeName:String?,companyName:String,shoeDescription:String?,size:Int){

        if (shoeName == null || shoeDescription == null) {
            return
        }
        val image = dataSource.getRandomShoeImageAsset()
        val newShoe = Shoe(Random.nextLong(),shoeName,companyName,size,image,shoeDescription)
        dataSource.addShoe(newShoe)
    }*/

   /* fun addShoe(id:Long,name:String,companyName:String,size:Int,description:String){
        val image = dataSource.getRandomShoeImageAsset()

        var _shoe:Shoe = Shoe(id,name.toString(),companyName.toString(),size.toInt(),null, description.toString())


        dataSource.addShoe(_shoe)
    }*/


}

class ShoeDetailViewModelFactory(private val context: Context) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ShoeDetailViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ShoeDetailViewModel(
                dataSource = DataSource.getDataSource(context.resources)
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}