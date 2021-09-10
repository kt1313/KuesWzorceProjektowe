package pl.strefakursow;

import pl.strefakursow.models.FamilyHouse;
import pl.strefakursow.observers.ObservableTempValue;

import java.util.Observable;
import java.util.Observer;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here
        creationPatterns();

        // obsluga interfejsu uzytkownika
        //obsluga zmian repozytorium
        //obslugiwac zmiany w czujnikach

        //NA PEWNO NIE ODPYTUJEMY obserwowanego
        //obiekt obserwowany informuje zaintersowane obiekty o zmianie


        ObservableTempValue observableValue=new ObservableTempValue(){};

        observableValue.addObserver((o, arg) -> System.out.println("1 "+arg.toString()));
        observableValue.addObserver((o, arg) -> System.out.println("2 " + arg.toString()));
while (true) {

Thread.sleep(500);
    observableValue.setValue((int)(observableValue.getOldTemp()+Math.random()*6-2));


}






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

