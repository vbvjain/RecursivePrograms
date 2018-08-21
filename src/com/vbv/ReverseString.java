package com.vbv;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        String s = "vaibhav";
        String  l =  reverseString.rev(s);
        System.out.println(l);
    }

    private String rev(String s) {
        if (s.length()==1) return s;
        else{
            return rev(s.substring(1))+s.charAt(0);
        }
    }

}
