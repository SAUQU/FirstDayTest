package com.example.bb_lt_974286.firstdaytest;

/**
 * Created by BB-LT-974286 on 8/1/2017.
 */

public class Test {

    public static void main (String [] args){

        // if number divisible by 3 print "fizz"
        // if number divisible by 5 print "buzz"
        // if number divisible by both print "fizzBuzz"
        int i = 100;
        for (i= 0; i > 100; i++){
            if ((i%3) == 0){
                System.out.print("fizz");
            }

            if((i%5) == 0){
                System.out.print("buzz");
            }

            if (i%5 == 0 && i%3 == 0){
                System.out.print("fizzBuzz");
            }
        }
        }

//public void printFizzBuzz(ArrayList<Integer> numbers){

    //      }

}

/*
    //Problem 2
    //Print out the duplicate strings in a arraylist of strings
    ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("A");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("B");
        stringArrayList.add("E");



