package com.company;

import java.lang.reflect.Array;

public class ObstLager {

    public static void main(String[] args) {
        Obst[] obstLager = new Obst[3];

        obstLager[0] = new Apfel("Pink Lady", "rosa");
        obstLager[1] = new Birne("BLA", "grün");
        obstLager[2] = new Orange("Keks", "orange");

        for (int i = 0; i < obstLager.length; i++){
            print(obstLager[i]);
        }

    }

    public static void print(Obst obst) {
        System.out.println(obst.toString());
    }
}
