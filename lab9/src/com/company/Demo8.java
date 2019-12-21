package com.company;

import java.util.Scanner;

public class Demo8 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        int i = 0;
        while (i<1)
        {
            try
            {
                String key = myScanner.nextLine();
                printDetails(key);
                i+=1;
            }
            catch (Exception e)
            {
                System.out.println(e.getLocalizedMessage());
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}
