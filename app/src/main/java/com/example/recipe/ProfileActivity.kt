package com.example.recipe

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.example.recipe.ui.theme.RecipeTheme

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipeTheme {
                ProfileScreen(meal = meal)
            }
        }
    }

    companion object {
        private const val MEAL_ID = "meal_id"
        fun newIntent(context: Context, meal: Meal) =
            Intent(context, ProfileActivity::class.java).apply {
                putExtra(MEAL_ID, meal)
            }
    }

    private val meal: Meal by lazy {
        intent?.getSerializableExtra(MEAL_ID) as Meal
    }
}