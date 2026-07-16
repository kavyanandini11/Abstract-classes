package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {

    public String getModelName() {
        return "Hero Splendor";
    }

    public String getRegistrationNumber() {
        return "AP01AB1234";
    }

    public String getOwnerName() {
        return "Ravi";
    }

    public int getSpeed() {
        return 70;
    }

    public void radio() {
        System.out.println("Radio is ON");
    }
}