package com.example.modul2new

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BabyAdapter (private val context: Context, private val baby: List<Baby>, val listener: (Baby) -> Unit)
    : RecyclerView.Adapter<BabyAdapter.BabyViewHolder>(){

    class BabyViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgBaby = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameBaby = view.findViewById<TextView>(R.id.tv_item_name)
        val descBaby = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(baby: Baby, listener: (Baby) -> Unit){
            imgBaby.setImageResource(baby.imgBaby)
            nameBaby.text = baby.nameBaby
            descBaby.text = baby.descBaby


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BabyViewHolder {
        return BabyViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_penting, parent, false)
        )
    }

    override fun getItemCount(): Int = baby.size


    override fun onBindViewHolder(holder: BabyViewHolder, position: Int) {
        holder.bindView(baby[position], listener)
    }


}