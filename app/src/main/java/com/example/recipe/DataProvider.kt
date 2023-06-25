package com.example.recipe

object DataProvider {
    val mealList = listOf(
        Meal(
            id = 1,
            title = "Tea",
            type = "Breakfast or snack",
            servings = 2,
            difficulty = "Beginner",
            ingredients = "1 cup milk, " + "1 cup water, " + "1 teaspoon of tea powder, " +
                    "sugar or honey(optional)",
            steps = "1. Mix 1 cup of water and the same amount of milk and heat the mixture" +
                    " in a microwavable device or on the stove until hot.\n" +
                    "2. Add in one teaspoon of the tea powder and stir. " +
                    "Be careful not to add more than that because the tea will become highly concentrated.\n" +
                    "3. Wait for few minutes until the tea becomes brown.\n" +
                    "4. Turn off the stove when the tea rises to the top.\n" +
                    "5. Filter the tea into a cup through a netted device (sieve).\n"+
                    "6. (Optional) Sweeten with honey or sugar.\n" +
                    "7. Enjoy your piping hot cup of tea!",
            mealImageId = R.drawable.tea
        ),
        Meal(
            id = 2,
            title = "Pancakes",
            type = "Breakfast",
            servings = 3,
            difficulty = "Intermediate",
            ingredients = "2 cups flour, 3 eggs, 1 1/2 cups milk, 2 tablespoons butter, " +
                    "5 tablespoons sugar, butter or syrup (optional)",
            steps = "1. Crack the eggs into a bowl and beat until creamy. Add in the dry " +
                    "ingredients. Do not stir yet!\n" +
                    "2. Melt the butter completely (about a minute in a microwave is sufficient).\n" +
                    "3. Add the butter and milk to the mix. Stir gently, leaving some small clumps " +
                    "in the batter.\n" +
                    "4. Heat the frying pan to a medium-low flame.\n" +
                    "5. Slowly pour about 3 tablespoons to 1/4 cup batter onto the frying pan. The " +
                    "amount you pour will decide the final size of your pancakes.\n" +
                    "6. Cook for about two minutes or until the pancake is golden. You should then " +
                    "flip the pancake gently.\n" +
                    "7. Cook the other side until golden and remove.\n" +
                    "8. (Optional) Add butter or syrup to your pancakes for more flavor.\n" +
                    "9. Enjoy!",
            mealImageId = R.drawable.pancake
        ),
        Meal(
            id = 3,
            title = "Omelette",
            type = "Breakfast",
            servings = 1,
            difficulty = "Intermediate",
            ingredients = "2 eggs, 2 tablespoons butter or cooking oil, 1/2 tomato, 1/2 onion, " +
                    "sausage",
            steps = "1. Prepare the ingredients. Select and cut up all of your ingredients into " +
                    "bite-sized pieces.\n" +
                    "2. Crack the eggs and beat until completely mixed\n" +
                    "3. Add salt, pepper, flour (optional) and the ingredients to the eggs mixture\n" +
                    "4. Flip the omelette once the eggs bubble on top. Keep cooking for another " +
                    "minute or two, until the omelette is no longer runny\n" +
                    "5. Serve and enjoy!",
            mealImageId = R.drawable.omelette
        ),
        Meal(
            id = 4,
            title = "Smocha/Smokie chapo",
            type = "Breakfast, lunch, supper or snack",
            servings = 1,
            difficulty = "Beginner",
            ingredients = "1 chapati, 1 smokie, 2 tablespoon kachumbari, 1/8 avocado (optional), " +
                    "tomato sauce, bbq sauce, mayonnaise",
            steps = "1. Cut the smokie vertically but not fully in half.\n" +
                    "2. Place the smokie on the chapati and add the kachumbari to the middle.\n" +
                    "3. (Optional) Add the avocado, tomato sauce, bbq sauce and/or mayonnaise.\n" +
                    "4. Cut into half and enjoy!",
            mealImageId = R.drawable.smocha
        ),
        Meal(
            id = 5,
            title = "Fries",
            type = "Lunch or supper",
            servings = 4,
            difficulty = "Intermediate",
            ingredients = "10 large potatoes, 1L of frying oil, a few pinches of salt, " +
                    "ketchup (optional)",
            steps = "1. Peel and rinse the potatoes. Then cut them into sticks.\n" +
                    "2. Rinse them again with cold water. Then let them completely dry.\n" +
                    "3. Pour the oil into a heavy pot and turn the burner to medium-high and heat " +
                    "the oil\n" +
                    "4. Lower 1/3 of the fries into the oil and fry them for 6 to 9 minutes.\n" +
                    "5. Transfer the fries to paper towels, sprinkle on salt and repeat for the " +
                    "remaining 2 batches.\n" +
                    "6. (Optional) Serve with ketchup.\n" +
                    "7. Enjoy!",
            mealImageId = R.drawable.fries
        ),
        Meal(
            id = 6,
            title = "White Rice",
            type = "Lunch or supper",
            servings = 1,
            difficulty = "Beginner",
            ingredients = "1 cup of white rice, 1 to 1 1⁄4 cups of water, " +
                    "1/2 teaspoon of salt (optional), 1 tablespoon of unsalted butter (optional)\n",
            steps = "1. Pour the rice into a fine, mesh strainer, then hold the strainer under cool," +
                    " running water until the water runs clear to rinse it.\n" +
                    "2. Combine the water and rinsed rice in a pot. Pour the water into the pot " +
                    "first, then add the rice.\n" +
                    "3. Add some salt and butter (optional), and bring the rice to a boil over high" +
                    " heat.\n" +
                    "4. Once boiling, reduce the heat to low or medium-low. Wait for the water to " +
                    "reduce to a simmer, then wait for 18 to 20 minutes. If it's not done, cook it " +
                    "for another 1 to 2 minutes. The rice is ready when the water disappears.\n" +
                    "5. Take the rice off the burner and let it sit, covered, for 15 to 20 minutes.\n" +
                    "6. Fluff the rice with a fork, serve it and enjoy!\n",
            mealImageId = R.drawable.rice
        ),
        Meal(
            id = 7,
            title = "Milkshake",
            type = "Snack",
            servings = 2,
            difficulty = "Beginner",
            ingredients = "6 scoops of ice cream, 1/2 cup milk, any flavour syrup (optional), " +
                    "vanilla extract (optional), malt powder (optional), frozen fruit (optional)",
            steps = "1. Let your ice cream soften to the consistency of soft-serve. A few minutes " +
                    "will do.\n" +
                    "2. Add the ice cream to your blender or milkshake mixer.\n" +
                    "3. Pour in the milk, vanilla extract(optional), and any additional ingredients.\n" +
                    "4. Blend your milkshake for between 30 seconds and 1 minute.\n" +
                    "5. Pour the milkshake into your chilled glass and enjoy!",
            mealImageId = R.drawable.milkshake
        ),
    )
}