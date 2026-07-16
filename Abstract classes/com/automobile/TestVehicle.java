package com.automobile;

import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class TestVehicle {

    public static void main(String[] args) {

        Hero h1 = new Hero();

        System.out.println(h1.getModelName());
        System.out.println(h1.getRegistrationNumber());
        System.out.println(h1.getOwnerName());
        System.out.println(h1.getSpeed());

        h1.radio();

        System.out.println();

        Honda h2 = new Honda();

        System.out.println(h2.getModelName());
        System.out.println(h2.getRegistrationNumber());
        System.out.println(h2.getOwnerName());
        System.out.println(h2.getSpeed());

        h2.cdplayer();
    }
}