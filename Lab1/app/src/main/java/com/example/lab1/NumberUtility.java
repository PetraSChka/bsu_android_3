package com.example.lab1;

public class NumberUtility {
    public static boolean isNumber(String str) {
        if (str.length() == 0) return false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') return false;
        }
        return true;
    }
}
