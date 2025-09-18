# 📂 Java Recipe Scaler
Recipe Scaler - Capstone project for Java (CSC 1060-502)

**Description**: A Java console application that scales recipes up or down based on user input. Users enter the original recipe and serving size, then specify the desired servings. The program calculates and outputs the adjusted ingredient amounts.

**Tech Stack**: Java
* Arrays for storing ingredients
* Loops and control statements for calculations
* Console-based user interface

**Features**
* Accepts user input for ingredients, measurements, and serving size
* Calculates new ingredient amounts based on desired servings
* Outputs the adjusted recipe to the console
* Menu-driven interface with input validation

**How to Run**
```
bash
javac RecipeScaler.java
java RecipeScaler
```

**Sample Usage**
```
Please enter the total number of ingredients in your recipe: 3
Please enter your recipe name: Grilled Cheese

For each ingredient, please enter each portion separately (e.g., “2”, “cups”, “flour”):
beginning with the amount, then the unit of measurement, then the name of the ingredient.

Please enter the amount in decimal form
(not a fraction, common decimals are 1/2 = 0.5, 1/3 = 0.33, 2/3 = 0.66, 1/4 = 0.25, 3/4 = 0.75): 2
Please enter the unit of measurement (e.g., cups, ounces, tablespoons): slices
Please enter the name of the ingredient: bread

Please enter the amount in decimal form
(not a fraction, common decimals are 1/2 = 0.5, 1/3 = 0.33, 2/3 = 0.66, 1/4 = 0.25, 3/4 = 0.75): 2
Please enter the unit of measurement (e.g., cups, ounces, tablespoons): slices
Please enter the name of the ingredient: cheese

Please enter the amount in decimal form
(not a fraction, common decimals are 1/2 = 0.5, 1/3 = 0.33, 2/3 = 0.66, 1/4 = 0.25, 3/4 = 0.75): 2
Please enter the unit of measurement (e.g., cups, ounces, tablespoons): tablespoons
Please enter the name of the ingredient: butter

Please enter the original serving size: 1
Please enter your desired serving size: 4

Thank you for using this recipe scaler program.
Grilled Cheese (modified for 4 servings):

8.00 slices bread
8.00 slices cheese
8.00 tablespoons butter

Would you like to recalculate another recipe?
Press 1 to begin entering your recipe information or press 0 to quit: 
```

**Possible Future Improvements**
* Add file I/O for saving and loading recipes
* Extend to support unit conversions (e.g., cups to tablespoons)
* Expand input validation for different ingredient formats
