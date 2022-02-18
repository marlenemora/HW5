package com.example.hw5

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class AddRecipeActivity : AppCompatActivity() {
    lateinit var recipeTitle : EditText
    lateinit var ingInput : EditText
    lateinit var dirInput : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_recipe)

        recipeTitle = findViewById(R.id.recipeTitle)
        ingInput = findViewById(R.id.ingredientsInput)
        dirInput = findViewById(R.id.directionsInput)

    }//onCreate
    fun submitRecipe(view : View) {
        recipeTitles.add(recipeTitle.text.toString())
        ingredientsList.add(ingInput.text.toString())
        directionsList.add(dirInput.text.toString())
        //arrayAdapter.notifyDataSetChanged();

        sharedPreferences = applicationContext.getSharedPreferences(
            "com.example.hw5", Context.MODE_PRIVATE)
        sharedPreferences.edit().putString("recipteTitles", ObjectSerializer.serialize(recipeTitles))
            .apply()
        sharedPreferences.edit().putString("ingredientsList", ObjectSerializer.serialize(ingredientsList))
            .apply()
        sharedPreferences.edit().putString("directionsList", ObjectSerializer.serialize(directionsList))
            .apply()
        val intent = Intent(applicationContext, BrowseRecipesActivity::class.java)
        startActivity(intent)
    }//submitRecipe
}//MainActivity