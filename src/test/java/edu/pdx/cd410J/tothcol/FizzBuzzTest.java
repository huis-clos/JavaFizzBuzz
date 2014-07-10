package edu.pdx.cd410J.tothcol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ctizzle on 7/9/14.
 */
public class FizzBuzzTest {

    @Test
    public void test1PrintsOne(){
        assertEquals("FizzBuzz of one", "1", FizzBuzz.fizzbuzz(1));
    }

    @Test
    public void test3PrintsFizz(){
        assertEquals("FizzBuzz of three", "fizz", FizzBuzz.fizzbuzz(3));
    }

}
