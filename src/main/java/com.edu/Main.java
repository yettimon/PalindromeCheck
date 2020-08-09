package com.edu;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String possiblyPalindrome = "";
        PalindromeService palindromeService = new PalindromeService();
        System.out.println(PalindromeService.check(possiblyPalindrome));

    }
}
