package org.example;

public class Fizzbuzz {
    public String convert(int inputNumber){

        if(inputNumber % 3 == 0 && inputNumber % 5 == 0){
            return "FizzBuzz";
        }

        if(inputNumber % 5 == 0){
            return "Buzz";
        }

        if(inputNumber % 3 == 0){
            return "Fizz";
        }

        return String.valueOf(inputNumber);
    }
}