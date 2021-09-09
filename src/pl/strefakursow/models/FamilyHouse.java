package pl.strefakursow.models;

import pl.strefakursow.House;

public class FamilyHouse {

    String adress;
    Integer floorsNumber;

    public FamilyHouse(String adress, Integer floorsNumber) {

        this.adress = adress;
        this.floorsNumber = floorsNumber;
    }

    public static FamilyHouse from(House house){
        return new FamilyHouse(house.getAdress(), house.getFloorsNumber());
    }


}
