package pl.strefakursow;

import pl.strefakursow.adapter.OfficialTrippingEmployee;
import pl.strefakursow.models.FamilyHouse;
import pl.strefakursow.observers.ObservableTempValue;
import pl.strefakursow.strategy.*;

import java.util.Observable;
import java.util.Observer;

public class Main {

    public static void main(String[] args) {
        // write your code here
        creationPatterns();
        observerPattern();

        Employee mike = new Employee();

        mike.travelStrategy = new BikeTravelStrategy();
        mike.jobStrategy = new DoctorJobStrategy();
        mike.breakfastStartegy = new SandwichBreakfastStrategy();

        mike.goToWork();
        mike.doYourJob();
        mike.eatYourBreakfast(mike);

        mike.travelStrategy = new CarTravelStrategy();
        mike.goToWork();

        OfficialTrippingEmployee otMike =new OfficialTrippingEmployee(mike);
        otMike.goToClient();

        System.out.println("zarobki przed: "+mike.getSalary());
        System.out.println("zarobki po: "+new FreqBonus(new DeadlineBonus(new SpecialBonus(mike))).getSalary());



        return;
    }


    //while (true) {
//Thread.sleep(500);
//    observableValue.setValue((int)(observableValue.getOldTemp()+Math.random()*6-2));
//}

    private static void observerPattern() {
        // obsluga interfejsu uzytkownika
        //obsluga zmian repozytorium
        //obslugiwac zmiany w czujnikach

        //NA PEWNO NIE ODPYTUJEMY obserwowanego
        //obiekt obserwowany informuje zaintersowane obiekty o zmianie

        ObservableTempValue observableValue = new ObservableTempValue() {
        };

        observableValue.addObserver((o, arg) -> System.out.println("1 " + arg.toString()));
        observableValue.addObserver((o, arg) -> System.out.println("2 " + arg.toString()));
    }


    private static void creationPatterns() {
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

        Logger.getInstance().logToConsole();
        {
            //
        }
    }

}

