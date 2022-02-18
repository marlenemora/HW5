package com.example.hw5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var buttonAdd : Button
    lateinit var buttonBrowse : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAdd = findViewById(R.id.buttonAdd)
        buttonBrowse = findViewById(R.id.buttonBrowse)

    }//onCreate

    fun browseList(view : View) {
        val browseIntent = Intent(this, BrowseRecipesActivity::class.java)

        startActivity(browseIntent)

    }//browseList

    fun callAddRecipe(view : View) {
        val addRecipeIntent = Intent(this, AddRecipeActivity::class.java)

        startActivity(addRecipeIntent)

    }//callAddRecipe
}//MainActivity