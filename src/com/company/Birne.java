package com.company;

public class Birne implements Obst{
    private String farbe;
    private String name;

    public Birne(String name, String farbe) {
        this.name = name;
        this.farbe = farbe;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getFarbe() {
        return this.farbe;
    }

    @Override
    public String toString() {
        return "Birne{" +
                "farbe='" + farbe + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
