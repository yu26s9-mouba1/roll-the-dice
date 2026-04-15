package com.pluralsight;

public class Dice {

   //Method created to make calls
    public int roll() {


        //Using math.random to generate ramdom numberss
        int randomNumber = (int)(Math.random() * 6) + 1;
        return randomNumber;

    }



    public static void main(String[] args) {


    }
}




