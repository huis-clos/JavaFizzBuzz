package edu.pdx.cd410J.tothcol;

/**
 * Created by ctizzle on 7/9/14.
 */
public class FizzBuzz {

    public static String fizzbuzz(int number) {
        if(number%3 == 0)
            return "fizz";
        else
            return ((Integer)number).toString();
    }

    public static void count(int number) {
        for (int i = 1; i < number; i++) {
            fizzbuzz(i);
        }
    }
}
