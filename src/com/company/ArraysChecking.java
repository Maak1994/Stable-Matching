package com.company;

public class ArraysChecking {
    public static void DupArrays(int[][] v, int[][] h){
        int totadd=0;
        int loopadd;
        int newlan=0;
        int newlan2=0;
        boolean valu= false;
        for(int p=1; p<=v.length; p++){

             totadd+=p;

        }
        //System.out.println(totadd);
        do{

            loopadd=0;

            // Select the first element and check if there is any elements that match
            for(int i=0; i<v.length;i++ ) {
                outerloop:

                // Select the second element and see if they match with first element
                for (int j = i + 1; j < v.length; j++) {
                    //if the first element is equal to second element
                    if (v[i][0] == v[j][0]) {
                        int newi= i;
                        int newj=j;
                        // then check the woman array to to see who is her first preference
                        for(int b=0; b<v.length; b++) {
                            //Checking if the i comes before j
                            if (h[((v[j][0])-1)][b] == newi+1) {
                                //checking if the first element is equal to second element and assign  next element as the first one

                                for(int c=1;c<v.length;c++){
                                    valu= false;

                                        if(v[j][c]==  0 ){

                                            valu= true;

                                         // else assign the next element as the first one
                                        }


                                    if(!valu) {
                                        v[j][0] = v[j][c];
                                        v[j][c]=0;

                                        i=-1;
                                        break outerloop;
                                    }
                                }
                                //v[j][0] = v[j][z]
                            // else j came before i
                            }else if(h[((v[j][0])-1)][b] == newj+1){
                                //checking if the first element is equal to second element and assign  next element as the first one

                                for(int s=1;s<v.length;s++){
                                    valu= false;

                                        if(v[i][s] ==0 ){
                                            valu= true;
                                            // else assign the next element as the first one
                                        }


                                    if(!valu) {
                                        v[i][0] = v[i][s];
                                        v[i][s]= 0;

                                        i=-1;
                                        break outerloop;
                                    }
                                }
                                // else assign the next element as the first one

                            }


                        }
                        //v[j][0] = v[j][z];// System.out.println("There is duplicate: "+ v[j][0]);
                    }


                }



            }
            for(int i=0; i<v.length;i++ ) {
                loopadd += v[i][0];
                //System.out.println("This is loopadd: " + loopadd);
            }
            if( loopadd == totadd){
                //System.out.println("The if loop over here: "+loopadd);
                newlan=1;
            }
        }while(newlan != 1);

        do{

            loopadd=0;

            // Select the first element and check if there is any elements that match
            for(int i=0; i<h.length;i++ ) {
                outerloop:

                // Select the second element and see if they match with first element
                for (int j = i + 1; j < h.length; j++) {
                    //if the first element is equal to second element
                    if (h[i][0] == h[j][0]) {
                        int newi= i;
                        int newj=j;
                        // then check the woman array to to see who is her first preference
                        for(int b=0; b<h.length; b++) {
                            //Checking if the i comes before j
                            if (v[((h[j][0])-1)][b] == newi+1) {
                                //checking if the first element is equal to second element and assign  next element as the first one

                                for(int c=1;c<h.length;c++){
                                    valu= false;

                                    if(h[j][c]==  0 ){

                                        valu= true;

                                        // else assign the next element as the first one
                                    }


                                    if(!valu) {
                                        h[j][0] = h[j][c];
                                        h[j][c]=0;

                                        i=-1;
                                        break outerloop;
                                    }
                                }
                                //v[j][0] = v[j][z]
                                // else j came before i
                            }else if(v[((h[j][0])-1)][b] == newj+1){
                                //checking if the first element is equal to second element and assign  next element as the first one

                                for(int s=1;s<h.length;s++){
                                    valu= false;

                                    if(h[i][s] ==0 ){
                                        valu= true;
                                        // else assign the next element as the first one
                                    }


                                    if(!valu) {
                                        h[i][0] = h[i][s];
                                        h[i][s]= 0;

                                        i=-1;
                                        break outerloop;
                                    }
                                }
                                // else assign the next element as the first one

                            }


                        }
                        //v[j][0] = v[j][z];// System.out.println("There is duplicate: "+ v[j][0]);
                    }


                }



            }
            for(int i=0; i<h.length;i++ ) {
                loopadd += h[i][0];
                //System.out.println("This is loopadd: " + loopadd);
            }
            if( loopadd == totadd){
                //System.out.println("The if loop over here: "+loopadd);
                newlan2=1;
            }
        }while(newlan2 != 1);


    }
}
