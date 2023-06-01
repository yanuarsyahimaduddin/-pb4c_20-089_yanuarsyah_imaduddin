package com.example.modul3

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ListUnivAdapter(val listUniv: ArrayList<Univ>) : RecyclerView.Adapter<ListUnivAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_card_univ, viewGroup,false )
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listUniv.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name) = listUniv[position]



        holder.tvName.text = name


        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, detail_univ::class.java)

            moveDetail.putExtra(detail_univ.EXTRA_NAME, name)

            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)

    }

}