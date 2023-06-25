package com.example.recipe

import java.io.Serializable

data class Meal(
    val id: Int,
    val title: String,
    val type: String,
    val servings: Int,
    val difficulty: String,
    val ingredients: String,
    val steps: String,
    val mealImageId: Int = 0
) :Serializable
