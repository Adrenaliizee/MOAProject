package nl.larsvelthuis.moaproject;

/**
 * Created by Wouter on 13-11-2015.
 */
public class Dobbelsteen {

    //Het aantal ogen dat een dobbelsteen kan hebben.
    private final int max = 6;

    //De huidige waarde
    private int currentValue;

    //Constructor
    public Dobbelsteen(){
        currentValue = 1;
    }

    //Methode om een dobbelsteen te gooien. Geeft een int terug voor het aantal ogen.
    public int gooi(){
        currentValue = (int)(Math.random() * max) + 1;
        return currentValue;
    }

    //Geeft de huidige waarde terug
    public int getCurrentValue(){
        return currentValue;
    }

    @Override
    public String toString() {
        return Integer.toString(currentValue);
    }
}

