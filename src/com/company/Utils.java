package com.company;

public class Utils {

    public static String capitalizedFirstCharOfString(String s) {
        return s.substring(0,1).toUpperCase() +
                s.substring(1).toLowerCase();
    }
}
