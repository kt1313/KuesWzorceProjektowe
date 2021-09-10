package pl.strefakursow.observers;

import java.awt.image.ImageObserver;
import java.util.Observable;

public class ObservableTempValue extends Observable {
private int oldTemp=0;

    public void setValue(int newTemp) {
        if (oldTemp != newTemp) {
            super.setChanged();
            super.notifyObservers(newTemp);
            oldTemp = newTemp;
        }
    }

    public int getOldTemp() {
        return oldTemp;
    }
}
