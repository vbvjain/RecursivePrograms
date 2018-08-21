package com.vbv;

public class CalculatePower {
    public static void main(String[] args) {
        CalculatePower calculatePower = new CalculatePower();
        int power = calculatePower.power(9, 4);
        System.out.println(power);
    }

    private int power(int x, int y) {
            if (y==1) return x;
            else{
                return power(x,y-1)*x;
            }
    }
}
