package com.edu;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class PalindromeServiceTest {

    Logger LOGGER =  Logger.getLogger(PalindromeServiceTest.class.getName());

    @Test
    public void checkPalindromeTrue() {
        Assert.assertEquals(true,PalindromeService.check("alula"));
    }
    @Test
    public void checkPalindromeNotCorrect() {
        Assert.assertEquals(false,PalindromeService.check("alulu"));
    }
    @Test
    public void checkPalindromeEqualsNull() {
        Assert.assertEquals(null,PalindromeService.check(null));
    }
    @Test
    public void checkRussianPalindrome() {
        Assert.assertEquals(true,PalindromeService.check("УккУ"));
    }
    @Test
    public void checkNumbersIsPalindrome() {
        Assert.assertEquals(false,PalindromeService.check("12312312321"));
    }
}