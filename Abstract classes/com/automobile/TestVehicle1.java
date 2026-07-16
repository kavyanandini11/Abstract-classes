package com.automobile;

import com.automobile.twowheeler.*;
import com.automobile.fourwheeler.*;

public class TestVehicle1 {

    public static void main(String[] args) {

        Hero hero = new Hero();

        System.out.println(hero.getModelName());
        System.out.println(hero.getSpeed());
        hero.radio();

        System.out.println();

        Honda honda = new Honda();

        System.out.println(honda.getModelName());
        System.out.println(honda.getSpeed());
        honda.cdplayer();

        System.out.println();

        Logan logan = new Logan();

        System.out.println(logan.getModelName());
        System.out.println(logan.speed());
        logan.gps();

        System.out.println();

        Ford ford = new Ford();

        System.out.println(ford.getModelName());
        System.out.println(ford.speed());
        ford.tempControl();
    }
}