package com.vbv;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        ArraySum as = new ArraySum();
        int[] arr = {1,4,5,6,6,67};
        int sum =  as.sum(arr);
        System.out.println(sum);
    }

    private int sum(int[] arr) {
        if (arr.length==1) return arr[0];
        else{
            return arr[0]+ sum(Arrays.copyOfRange(arr,1,arr.length));
        }
    }
}
