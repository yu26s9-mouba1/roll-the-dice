package com.pluralsight;

public class Dice {

   //Method created to make calls
    public int roll() {


        //Using math.random to generate ramdom numberss
        int randomNumber = (int)(Math.random() * 6) + 1;
        return randomNumber;

    }



    public static void main(String[] args) {

        //Creating the dice object
        Dice dice = new Dice();

        //Creating Variables for rolls
        int roll1;
        int roll2;

        //Creaters variables as Counters
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        // Using a for loop to make the dice roll count 100 times

        for (int i = 1; i <= 100; i++) {

            roll1 = dice.roll();
            roll2 = dice.roll();

            int sum = roll1 + roll2;

            //Now, I can print the result
            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + sum);


            //using if-else statements to create rules for the game making sure it makes specific counts
            if (sum == 2) {
                twoCounter++;
            }
            if (sum == 4) {
                fourCounter++;
            }
            if (sum == 6) {
                sixCounter++;
            }
            if (sum == 7) {
                sevenCounter++;
            }
        }

        //Finally, we can display results













        }









        }
}




