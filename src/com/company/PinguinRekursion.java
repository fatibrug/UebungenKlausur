package com.company;

public class PinguinRekursion {

    public static void main(String[] args) {

pinguinLiest();

    }
    public static void pinguinLiest() {
        System.out.println("Der Pinguin schlug die Zeitung auf, da stand: ");

        pinguinLiest();
    }
}
