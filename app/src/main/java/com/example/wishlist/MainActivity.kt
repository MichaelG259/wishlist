package com.example.wishlist

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wishlist.ui.theme.WishlistTheme


class MainActivity : ComponentActivity() {
    //lateinit var items: List<Item>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
        val button = findViewById<Button>(R.id.submitbutton)
        val itemname = findViewById<TextView>(R.id.namebox)
        val itemprice = findViewById<TextView>(R.id.pricebox)
        val itemurl = findViewById<TextView>(R.id.urlbox)
        val wishlist = findViewById<RecyclerView>(R.id.shoppinglist)
        var items : MutableList<Item> = ArrayList()
        val adapter = listadapter(items)
        wishlist.adapter = adapter
        wishlist.layoutManager = LinearLayoutManager(this)
        button.setOnClickListener {
            val wishlistitem = Item(itemname.text.toString(), itemprice.text.toString(), itemurl.text.toString())
            items.add(wishlistitem)
            adapter.notifyDataSetChanged()
        }

    }
}

