package com.vbv;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String inp = "Some men interpret nine memos";
        boolean isP =  palindrome.isPalin(inp.replace(" ","").toLowerCase());
        System.out.println(isP);
    }

    private boolean isPalin(String s) {
        if (s.length()==1|| s.length()==0){
            return true;
        }
        else{
            char f = s.charAt(0);
            char l = s.charAt(s.length()-1);
            if (f==l){
                String substring = s.substring(1, s.length() - 1);
                return isPalin(substring);
            }else{
                return false;
            }
        }
    }
}
