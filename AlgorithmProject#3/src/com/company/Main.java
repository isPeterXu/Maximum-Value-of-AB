package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n = 4; //the number of neighbors n > 0
        int k = 2; //at most k adjacent neighbors
        int boundLength = 10; // upper bound of the value of a[i]
        int[] a = new int[n];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(boundLength);
        }

        //print a[]
        for(int e : a){
            System.out.println(e);
        }

        MaxValue maxValue = new MaxValue();
        //long startTime = System.currentTimeMillis();
        long startTime = System.nanoTime();
        int Max = maxValue.getMaxSum(a,k); // Max = SumArray[n-1]
        //long endTime = System.currentTimeMillis();
        long endTime = System.nanoTime();
        System.out.println("Maximum Value: " + Max);
        System.out.println("Elapsed time: " + (endTime - startTime) + "ns");
    }
}
