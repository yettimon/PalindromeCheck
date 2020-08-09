package com.edu;

import java.util.logging.Logger;

public class PalindromeService {
    private static final Logger LOGGER =
            Logger.getLogger(PalindromeService.class.getName());

    private static String cleanString(String stringToClean){
        if (stringToClean == null){return null;}
        return stringToClean.toLowerCase().replaceAll("[^A-Za-z0-9]", "");

    }

    public static Boolean check (String possiblyPalindrome){
        LOGGER.info("Creating check method");
        String cleanedString = cleanString(possiblyPalindrome);
        if (possiblyPalindrome == null){return null;}
        if (possiblyPalindrome.length() == 0) return false;
    return new StringBuilder(cleanedString).reverse().toString().equals(cleanedString);
    }
}
