package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    public String getModelName() {
        return "Ford EcoSport";
    }

    public String getRegistrationNumber() {
        return "AP04GH2222";
    }

    public String getOwnerName() {
        return "Mahesh";
    }

    public int speed() {
        return 170;
    }

    public void tempControl() {
        System.out.println("Air Conditioner ON");
    }
}