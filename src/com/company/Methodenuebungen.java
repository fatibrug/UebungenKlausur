package com.company;

public class Methodenuebungen {

    public static void main(String[] args) {

        System.out.println(builtWeatherText("sunny", " :) "));

    }

    public static String builtWeatherText(String weather, String emotion){

        return "It's " + weather + " " + emotion;
    }
}
