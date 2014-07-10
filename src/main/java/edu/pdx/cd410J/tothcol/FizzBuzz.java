package edu.pdx.cd410J.tothcol;

/**
 * Created by ctizzle on 7/9/14.
 */
public class FizzBuzz {

    public static String fizzbuzz(int number) {
        if(number == 1)
            return "1";
        else
            return "fizz";
    }

    public static void count(int number) {
        for (int i = 1; i < number; i++) {
            fizzbuzz(i);
        }
    }
}
