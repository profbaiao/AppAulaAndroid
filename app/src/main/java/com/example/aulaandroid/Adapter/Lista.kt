package com.example.aulaandroid.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aulaandroid.Models.Item
import com.example.aulaandroid.R

class Lista(private val list: List<Item>) : RecyclerView.Adapter<Lista.ListViewHolder>() {
    class ListViewHolder(view: View) :RecyclerView.ViewHolder(view) {

        val recTitle : TextView = view.findViewById(R.id.recTitle)
        val recDesc : TextView = view.findViewById(R.id.recDesc);
        val recPriority : TextView= view.findViewById(R.id.recPriority);

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itens_lista,parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val item = list[position]
        holder.recTitle.text = item.title
        holder.recDesc.text = item.desc
        holder.recPriority.text = item.priority
    }

    override fun getItemCount(): Int {
        return list.size
    }
}