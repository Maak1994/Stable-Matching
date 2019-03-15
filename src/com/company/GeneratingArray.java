package com.company;
import java.util.EmptyStackException;

public class GeneratingArray {
    public static int[] NsizeArray(int n) {

        int[] testingarray = new int[n];
        //checking if n is greater than 0
        if(n >0) {

            // Using the value of n, looping through to generate an array ranging from 1 till n
            for (int i = 0; i < testingarray.length; i++) {
                testingarray[i] = i + 1;
            }
            return testingarray;
        }
        else{
            throw new EmptyStackException();
        }
    }
}
