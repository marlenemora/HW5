package com.example.hw5

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

lateinit var arrayAdapter: ArrayAdapter<*>
var recipeTitles = ArrayList<String>()
var ingredientsList = ArrayList<String>()
var directionsList = ArrayList<String>()
lateinit var sharedPreferences: SharedPreferences

class BrowseRecipesActivity : AppCompatActivity() {
    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browse_recipes)

        listView = findViewById(R.id.listView)

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, recipeTitles)
        listView.adapter = arrayAdapter
        listView.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->
                val intent = Intent(applicationContext, ViewRecipeActivity::class.java)
                intent.putExtra("Loc", i)
                startActivity(intent)
            }//OnItemClickListener
    }//onCreate
}//BrowseRecipesActivity