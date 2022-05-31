package com.keyin.wordChecker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class wordCheckerTest {


    @Test
    public void testUpper() {
        wordChecker wordCheckerUnderTest = new wordChecker();
        Assertions.assertEquals(true, wordChecker.isUpper("Hello"));
        Assertions.assertEquals(true, wordChecker.isUpper("Goodbye"));
        Assertions.assertNotEquals(false, wordChecker.isUpper("hello"));
    }

    @Test
    public void testLower() {
        wordChecker wordCheckerUnderTest = new wordChecker();
        Assertions.assertEquals(true, wordChecker.isLower("hello"));
        Assertions.assertEquals(true, wordChecker.isLower("goodbye"));
        Assertions.assertNotEquals(false, wordChecker.isLower("HELLO"));
    }

    @Test
    public void testNumber() {
        wordChecker wordCheckerUnderTest = new wordChecker();
        Assertions.assertEquals(true, wordChecker.isNumber("123"));
        Assertions.assertEquals(true, wordChecker.isNumber("456"));
        Assertions.assertNotEquals(false, wordChecker.isNumber("Hello"));
    }

}
