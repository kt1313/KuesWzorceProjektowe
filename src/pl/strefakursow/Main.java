package pl.strefakursow;

import pl.strefakursow.adapter.OfficialTrippingEmployee;
import pl.strefakursow.decorator.DeadlineBonus;
import pl.strefakursow.decorator.FreqBonus;
import pl.strefakursow.decorator.Payable;
import pl.strefakursow.decorator.SpecialBonus;
import pl.strefakursow.models.FamilyHouse;
import pl.strefakursow.observers.ObservableTempValue;
import pl.strefakursow.strategy.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        creationPatterns();
        observerPattern();


        ApiFacade facade=new ApiFacade();
        Employee mike = facade.createDoctor(10000);
        facade.pushDoctorToJob(mike);
        System.out.println("zarobki po: "+facade.countSalary(mike));
        facade.giveFreeHouseToBestFreqEmployee(mike);

        return;
    }

    private static void giveFreeHouseToBestFreqEmployee() {
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

