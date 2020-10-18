package com.softserve;

public class Main {
    public static void main(String[] args) {

        int year = 2012;
        boolean isLeap = false;

        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }
        System.out.println("Is " + year + " a leap year?\t" + isLeap);

    }
  }




