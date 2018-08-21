package com.vbv;

public class ArithmeticSum {
    public static void main(String[] args) {
            ArithmeticSum as = new ArithmeticSum();
        int sigma = as.sigma(100);
        System.out.println(sigma);
    }

    private int sigma(int i) {
        //base case when i == 1, return 1
        if (i==1) return 1;
        else  {
            return i + sigma(i - 1);
        }
    }

}
