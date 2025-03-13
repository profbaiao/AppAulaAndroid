package com.example.aulaandroid.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aulaandroid.Adapter.Categoria
import com.example.aulaandroid.Adapter.Produto
import com.example.aulaandroid.R

class DashboardActivity : AppCompatActivity() {

    private lateinit var categoriaRecyclerView: RecyclerView
    private lateinit var categoriaAdapter: Categoria
    private lateinit var categoriaImageList: List<Int>

    private lateinit var produtoRecyclerView: RecyclerView
    private lateinit var produtoAdapter: Produto
    private lateinit var produtoImageList: List<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        categoriaRecyclerView = findViewById(R.id.categoriaRV)
        produtoRecyclerView = findViewById(R.id.topProdutosRV)

        categoriaImageList = listOf(
            R.drawable.standing_5,
            R.drawable.standing_5,
            R.drawable.standing_5,
            R.drawable.standing_5,
            R.drawable.standing_5,
            R.drawable.standing_5

        )

        produtoImageList = listOf(
            R.drawable.standing_5,
            R.drawable.standing_5,
            R.drawable.standing_5,
            R.drawable.standing_5,
            R.drawable.standing_5,
            R.drawable.standing_5
        )

        categoriaAdapter = Categoria(categoriaImageList)
        categoriaRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        categoriaRecyclerView.adapter = categoriaAdapter

        produtoAdapter = Produto(produtoImageList)
        produtoRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        produtoRecyclerView.adapter = produtoAdapter




    }
}