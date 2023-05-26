package com.example.doglist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DogAdapter(private val images:List<String>):RecyclerView.Adapter<DogViweHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViweHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DogViweHolder(layoutInflater.inflate(R.layout.item_dog, parent, false))
    }

    override fun onBindViewHolder(holder: DogViweHolder, position: Int) {
        val item: String = images[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = images.size
}