package com.sdmag.iiuc.com;


public class Main {

    public static void main(String[] args) {

        GrandFather grandFather = new GrandFather();
        Dad dad = new Dad();
        Son son = new Son();


        grandFather.says();
        System.out.println( grandFather.numberOfCars );

        dad.says();
        System.out.println( dad.numberOfCars );

        son.says();
        System.out.println( "I have "+son.numberOfCars+" Cars" );

    }
}
