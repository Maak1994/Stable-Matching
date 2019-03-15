package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

         int arrcount =0;

        /*file reader*/
        BufferedReader filereader;
        try {

             filereader= new BufferedReader(new FileReader("/Users/Mac/IdeaProjects/Comp482Project1/src/com/company/input1.txt"));
             String firstletter = filereader.readLine();

            /* Scanning all the value and getting to n as the number of woman and male each*/
            Scanner line = new Scanner(filereader);
            int n = Integer.parseInt(firstletter);


            /* Testing the number of i_nital input*/
            //System.out.println("Here is the value of n: "+ n);
            int[][] male = new int[n][n];
            int[][] female= new int [n][n];
            int total=0;
            int totalnumber= 2*n;





             /*Start reading the file for first n number*/

             while( total<(totalnumber)) {
                 int row, col;
                /* Looping for rows reading*/
                 for (row = 0; row <n; row++) {

                        /* Looping to read all column number one by one*/
                         for ( col = 0; col <n; col++) {
                                      male[row][col] = line.nextInt();

                         }

                     /* add one to total so the reader will stop once total is equal to n*/


                     total+=1;

             }
                 for (row = 0; row <n; row++) {

                        /* Looping to read all column number one by one for females*/
                     for ( col = 0; col <n; col++) {
                         female[row][col] = line.nextInt();

                     }

                     /* add one to total so the reader will stop once total is equal to n*/


                     total+=1;


                 }

             /* Looping to print out all the values of the array*/



             }
             /* Terminating file reader for good*/
             filereader.close();

             /* Checking if there are duplicates */
             int[][] testingmale =  new int[male.length][male.length];
             int[][] testingfemale=  new int[female.length][female.length];

            for(int i=0;i<male.length;i++){
                for(int j=0; j< male.length; j++){
                    testingmale[i][j]= male[i][j];
                }
            }
            for(int i=0;i<female.length;i++){
                for(int j=0; j< female.length; j++){
                    testingfemale[i][j]= female[i][j];
                }
            }


            for(int p=0; p<male.length; p++){
                int r= male[p][0] + female[p][0];
                arrcount+= r ;

            }


            int newarccoutn= arrcount;




             ArraysChecking.DupArrays(testingmale,testingfemale);





            /* Getting all the permutation of n*/
            System.out.println("Output: " + Permutation.permute(testingmale,testingfemale,GeneratingArray.NsizeArray(n), 0, newarccoutn));





        // This will throw an exception if the file is empty or there is letter
        }catch (IOException e){
            e.printStackTrace();

        }


    }


}
