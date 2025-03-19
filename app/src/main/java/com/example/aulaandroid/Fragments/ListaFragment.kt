package com.example.aulaandroid.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aulaandroid.Adapter.Lista
import com.example.aulaandroid.Models.Item
import com.example.aulaandroid.R


class ListaFragment : Fragment() {
    private lateinit var listaRecyclerView: RecyclerView
    private lateinit var listaAdapter: Lista



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_lista, container, false)

        listaRecyclerView = view.findViewById(R.id.recyclerView)

        val data = ArrayList<Item>()

        data.add(Item("Título","Descrição","Alta"))
        data.add(Item("Título2","Descrição2","Alta"))
        data.add(Item("Título3","Descrição3","Alta"))


        listaAdapter = Lista(data)


        listaRecyclerView.layoutManager = LinearLayoutManager(
            activity,
            LinearLayoutManager.VERTICAL, false
        )
        listaRecyclerView.adapter = listaAdapter



        return view
    }


}