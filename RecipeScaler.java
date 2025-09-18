// Cathy Patton, 4/24/25, CSC 1060 502, Capstone Project - Recipe Scaler

import java.util.Scanner;

public class RecipeScaler {
    
    static int originalServings; // initialize some variables for all functions
    static int desiredServings;
    static String recipeName;


    public static void main(String[] args) { // function main runs the program

        menu(); // run menu function
        
    } // end function main


    public static void menu() { // begin menu function for user selection
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to increase or decrease the serving size of a recipe, this program will recalculate");
        System.out.println("your individual ingredients and display the modifications so you are ready to begin cooking.\n");

        int choice;

        do {
            System.out.print("Press 1 to begin entering your recipe information or press 0 to quit: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    input(); // run input method
                    break;
                case 0:
                    System.out.println("Bye-bye");
                    System.exit(0); // quit
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 0);
        
    } // end menu function


    public static void input() { // begin input function to receive user data
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the total number of ingredients in your recipe:");
        int arraySize = scanner.nextInt(); // initialize array size
        scanner.nextLine(); // consume newline

        float[] amount = new float[arraySize]; // initialize float amount array 
        String[] unit = new String[arraySize]; // initialize string unit array
        String[] ingredient = new String[arraySize]; // initialize string ingredient array

        System.out.println("Please enter your recipe name:");
        recipeName = scanner.nextLine(); // input recipe name for output

        System.out.println("\nFor each ingredient, please enter each portion separately (e.g., “2”, “cups”, “flour”):");
        System.out.println("beginning with the amount, then the unit of measurement, then the name of the ingredient.");

        for (int i = 0; i < arraySize; i++) { // for loop to fill three arrays with user data
            while (true) {
                System.out.println("\nPlease enter the amount in decimal form (not a fraction, ");
                System.out.println("common decimals are 1/2 = 0.5, 1/3 = 0.33, 2/3 = 0.66, 1/4 = 0.25, 3/4 = 0.75):");
                String floatDecimal = scanner.nextLine();

                if (floatDecimal.contains("/")) { // check for fraction from user
                    System.out.println("Error, it looks like you tried to enter a fraction. Please re-enter your amount in decimal form:");
                } else {
                    try {
                        amount[i] = Float.parseFloat(floatDecimal); // fill float amount array
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number in decimal form.");
                    }
                }
            }

            System.out.println("Please enter the unit of measurement (e.g., cups, ounces, tablespoons): ");
            unit[i] = scanner.nextLine(); // fill string unit array

            System.out.println("Please enter the name of the ingredient: ");
            ingredient[i] = scanner.nextLine(); // fill string ingredient array
            
        }

        System.out.println("\nPlease enter the original serving size: ");
        originalServings = scanner.nextInt();

        System.out.println("Please enter your desired serving size: ");
        desiredServings = scanner.nextInt();

        float[] recalculated = compute(amount, originalServings, desiredServings); // run compute function
        display(recalculated, unit, ingredient); // run display function
        
    } // end input function
    

    public static float[] compute(float[] amount, int originalServings, int desiredServings) { // begin compute function to recalculate recipe
        float[] recalculate = new float[amount.length]; // initialize float recalculated amount array

        for (int i = 0; i < amount.length; i++) { // perform calculations for each float in amount array
            recalculate[i] = (amount[i] / originalServings) * desiredServings;
        }

        return recalculate;
        
    } // end compute function
    

    public static void display(float[] recalculate, String[] unit, String[] ingredient) { // begin display function for output
        System.out.println("\nThank you for using this recipe scaler program.");
        System.out.println(recipeName + " (modified for " + desiredServings + " servings):\n"); // recipe header

        for (int i = 0; i < recalculate.length; i++) { // for loop to display adjusted amounts with unit and ingredient
            System.out.printf("%.2f %s %s%n", recalculate[i], unit[i], ingredient[i]);
        }
        System.out.println("\n"); // newline for readability
        System.out.println("Would you like to recalculate another recipe?"); // prompt user to continue or quit

    } // end display function
    
} // end of program

