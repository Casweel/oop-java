package com.company;

import java.util.Scanner;

public class Demo6 {
    public void getKey() {
        System.out.println("Enter the key");
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }

    public void printDetails(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) {
        try{
            if (key == "") {
                throw new Exception("Key set to empty string");
            }
            return "data for " + key;
        }
        catch (Exception e)
        {
            return e.getLocalizedMessage();
        }
    }
}
