package pl.strefakursow;

import pl.strefakursow.models.FamilyHouse;

public class Main {

    public static void main(String[] args) {
        // write your code here
        House house = new House.HouseBuilder()
                .setAdress("Za Zakretem 3")
                .setDoorsNumber(3)
                .setFloorsNumber(4)
                .setWindowsNumber(10)
                .build();


        //STATYCZNE METODY WYTWORCZE
        //from, of, valueOf, instanceOf
        boolean isTrue = true;
        Boolean.valueOf(isTrue);

        FamilyHouse familyHouse = FamilyHouse.from(house);

        Logger.getInstance().logToConsole() {
            //
        }

    }

}

