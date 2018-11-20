package com.company;

public class MaxValue {
    public int getMaxSum(int[] a, int k) {

        int[] SumArray = new int[a.length];

        /**
         * initialize the start value (at least one element in a[])
         */
        SumArray[0] = a[0];
        /**
         * if n<=k, our result SumArray[n-1]=a[0]+a[1]+...+a[n-1]
         */
        if(a.length <= k){
            for(int i = 1; i < a.length; i++)
            SumArray[i] = SumArray[i-1]+a[i];
        }
        /**
         * if n>k, we initialize the first k elements in SumArray
         * and calculate SumArray[n-1] use recursive formulation
         */
        else{ //
            for(int i = 1; i < k; i++) {
                SumArray[i] = SumArray[i - 1] + a[i];
            }
            SumArray[k] = SumArray[k - 1];
            for(int i = 0; i < k; i++){
                SumArray[k] = Math.max(SumArray[k], SumArray[k-1]+a[k]-a[i]); //initialize SumArray[k]
            }

            //calculate SumArray[k+1]-SumArray[a.length-1]
            for(int j = k + 1; j < a.length; j++){
                SumArray[j] = SumArray[j - 1];
                int arr = a[j];
                // max{  S[j-1], S[j-2]+S[j],.., (S[j-(k+1)]+a[j-(k-1)]+...+a[j]) }
                for(int v = 1; v <= k; v++){
                    SumArray[j] = Math.max(SumArray[j], SumArray[j-v-1] + arr);
                    arr = arr + a[j - v];
                }
            }
        }

        return SumArray[a.length - 1];//our result is SumArray[n-1]
    }
}
