package com.bellodev.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun init() {
        recyclerView = findViewById(R.id.recycler_view)

        var data = ArrayList<ResepMakanan>()
        data.add(ResepMakanan(R.drawable.sayurlodeh, "Sayur Lodeh", "Cara membuat sayur lodeh yang lezat"))
        data.add(ResepMakanan(R.drawable.ayamkatsu, "Ayam Katsu", "Cara membuat ayam katsu seperti di restoran"))
        data.add(ResepMakanan(R.drawable.bakwan, "Bakwan Mie Sayur", "Cara membuat bakwan mie sayur kekinian"))
        data.add(ResepMakanan(R.drawable.ayamkrispi, "Ayam Crispy", "Cara membuat ayam goreng krispi"))
        data.add(ResepMakanan(R.drawable.mieramen, "Mie Ramen", "Cara membuat mie ramen seperti aslinya"))
        data.add(ResepMakanan(R.drawable.ayamgeprek, "Ayam Geprek", "Cara membuat ayam geprek"))
        data.add(ResepMakanan(R.drawable.muffin, "Muffin Sayur", "Cara membuat muffin sayur yang enak"))
        data.add(ResepMakanan(R.drawable.nasikuning, "Nasi Kuning", "Cara membuat nasi kuning kerucut"))
        data.add(ResepMakanan(R.drawable.telurdadar, "Telur Dadar", "Cara membuat telur dadar yang enak dan estetik"))
        data.add(ResepMakanan(R.drawable.telurbalado, "Telur Balado", "Cara membuat telur balado hot"))

        adapter = MyAdapter(data)
    }

}