package com.company;

public class Permutation {
        private static int totalcount=0;



    static int permute(int[][] maley, int [][] femaley, int[] a, int k, int abccount) {
        int count=0;



        try {

            if (k == a.length) {
                outerloop:
                for (int w = 0; w < a.length; w++) {
                  //  System.out.println("");

                        for (int i = 0; i < a.length; i++) {
                            w += 1;
                         //   System.out.print(a[i] + " ");


                            if (abccount % (a.length * 2) == 0 && maley[0][0] ==femaley[0][0]){

                                if (( a[0]== maley[0][0] &&  a[i] == maley[i][0] || a[0]== maley[0][0] &&  femaley[(a[i]) - 1][0] == (i + 1)) || i == a.length - 1 ) {

                                    count += 1;
                                    continue;
                                } else {

                                    break outerloop;
                                }
                        } else if ((   a[i] == maley[i][0] ||   femaley[(a[i]) - 1][0] == (i + 1)) || i == a.length - 1 ) {

                                count += 1;
                                continue;
                            } else {

                                break outerloop;
                            }

                        }



                    //System.out.println();
                    if ((a.length) == count) {
                       totalcount+= 1;

                    }


                }


            } else {
                for (int i = k; i < a.length; i++) {
                    int temp = a[k];
                    a[k] = a[i];
                    a[i] = temp;

                    permute(maley, femaley, a, k + 1,abccount);

                    temp = a[k];
                    a[k] = a[i];
                    a[i] = temp;


                }
            }
        }catch (Exception ex){
            System.out.println("The computer ran out of time");
        }
        return totalcount;
    }


}
