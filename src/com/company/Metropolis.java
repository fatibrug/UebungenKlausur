package com.company;

public class Metropolis {

    public static void main(String[] args) {


        System.out.println(isMetropolis(true, 200000, 60000000));
        System.out.println(isMetropolis(true, 100000, 40000000));
        System.out.println(isMetropolis(false, 200000, 70000000));



    }
    public static boolean isMetropolis(boolean isCapital, int inhabitants, double texPerPersonAndMonth) {

        if ((inhabitants > 200000) || (isCapital & inhabitants > 100000) && (texPerPersonAndMonth*12) > 720000000) {
            return true;
        }
            return false;
        }
    }

