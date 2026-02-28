package com.javaoneshot;
import java.util.Arrays;


public class Main {

    public static void ra(int i, int n, int[]num){

        if (i>n){
          return;
        }
        else{
            int temp = num[i];
            num[i]=num[n];
            num[n]=temp;

        }
        ra(i+1,n-1,num);
    }
    public static void main(String []args){
        int i;
        int n;
        int[]num= {1,2,3,4,5};
        ra(i=0,num.length-1,num);
        System.out.println(Arrays.toString(num));
    }

}
