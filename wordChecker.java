package com.keyin.wordChecker;

import java.util.Scanner;

public class wordChecker {

    public static boolean isUpper(String value) {
              return  containsUpperCase(value);
    }

    private static boolean containsUpperCase(String value) {
        return true;
    }

    public static boolean isLower(String value) {
        return containsLowerCase(value);
    }

    private static boolean containsLowerCase(String value) {
        return true;
    }

    public static boolean isNumber(String value) {
        return  containsNumber(value);
    }

    private static boolean containsNumber(String value) {
        return true;
    }

}
