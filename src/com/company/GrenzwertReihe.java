package com.company;

public class GrenzwertReihe {

    public static void main(String[] args) {

       grenzWertReihe();
    }

        public static void grenzWertReihe(){

            for (double i = 1; i <= 1; i = i/2) {

                if (i - (i / 2) < 0.0001){
                    System.out.println( i );
                    break;
                }

            }
        }

}
