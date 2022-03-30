package com.company;

public class RekursionNeu {

    public static void main(String[] args) {


        countDown();
    }

    public static int countDown() {

        for (int i = 99; i >= 0; ++i) {
            countDown();

        }

    }
}