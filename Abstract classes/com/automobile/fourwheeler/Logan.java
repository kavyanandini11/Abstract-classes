package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {

    public String getModelName() {
        return "Logan";
    }

    public String getRegistrationNumber() {
        return "AP03EF1111";
    }

    public String getOwnerName() {
        return "Suresh";
    }

    public int speed() {
        return 150;
    }

    public void gps() {
        System.out.println("GPS Started");
    }
}