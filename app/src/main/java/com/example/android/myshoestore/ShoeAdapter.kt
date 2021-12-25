package com.example.android.myshoestore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
//import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.ListAdapter
import com.example.android.myshoestore.data.Shoe

//class ShoeAdapter(private val mShoes:List<Shoe>):
 //   RecyclerView.Adapter<ShoeAdapter.ShoeViewHolder>() {
class ShoeAdapter(private val onClick:(Shoe)-> Unit):
    ListAdapter<Shoe, ShoeAdapter.ShoeViewHolder>(ShoeDiffCallback) {

    // Define the listener interface
    interface OnItemClickListener {
        fun onItemClick(itemView: View?, position: Int)
    }

    // Define listener member variable
    private lateinit var listener: AdapterView.OnItemClickListener

    // Define the method that allows the parent activity or fragment to define the listener
    fun setOnItemClickListener(listener: AdapterView.OnItemClickListener) {
        this.listener = listener
    }

     class ShoeViewHolder(itemView: View,val onClick:(Shoe) -> Unit):RecyclerView.ViewHolder(itemView) {
        private val shoeTextView: TextView = itemView.findViewById(R.id.shoe_text)
        private val shoeImageView: ImageView = itemView.findViewById(R.id.shoe_image)
        private var currentShoe: Shoe? = null
        init {
            itemView.setOnClickListener {
                // Triggers click upwards to the adapter on click
                currentShoe?.let{
                    onClick(it)
                }
            }
        }



         /* Bind flower name and image. */
        fun bind(shoe: Shoe) {
            currentShoe = shoe

            shoeTextView.text = shoe.name
            if (shoe.image != null) {
                shoeImageView.setImageResource(shoe.image)
            } else {
                shoeImageView.setImageResource(R.drawable.shoeicon_background)
            }
        }
    }

    /* Creates and inflates view and return FlowerViewHolder. */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.shoe_item, parent, false)
        return ShoeViewHolder(view,onClick)
    }

    /* Gets current flower and uses it to bind view. */
    override fun onBindViewHolder(holder: ShoeViewHolder, position: Int) {
        val shoe = getItem(position)//mShoes.get(position)
        holder.bind(shoe)

    }

   /* override fun getItemCount(): Int {
        return mShoes.size
    }*/
}

object ShoeDiffCallback : DiffUtil.ItemCallback<Shoe>() {
    override fun areItemsTheSame(oldItem: Shoe, newItem: Shoe): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Shoe, newItem: Shoe): Boolean {
        return oldItem.id == newItem.id
    }
}
