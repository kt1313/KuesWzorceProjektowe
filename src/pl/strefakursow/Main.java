package pl.strefakursow;

import pl.strefakursow.models.FamilyHouse;

import java.util.Observable;
import java.util.Observer;

public class Main {

    public static void main(String[] args) {
        // write your code here
        creationPatterns();

        // obsluga interfejsu uzytkownika
        //obsluga zmian repozytorium
        //obslugiwac zmiany w czujnikach

        //NA PEWNO NIE ODPYTUJEMY obserwowanego
        //obiekt obserwowany informuje zaintersowane obiekty o zmianie

        Observable observableValue=new Observable(){
            @Override
            public void notifyObservers(Object arg) {
                super.setChanged();
                super.notifyObservers(arg);
            }
        };

        observableValue.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("1 "+arg.toString());
            }


        });

        observableValue.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("2 " + arg.toString());
            }
            });

        observableValue.notifyObservers(54);







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

