package nl.larsvelthuis.moaproject;

/**
 * Created by Wouter on 13-11-2015.
 */
public class Dobbelsteen {

    //Het aantal ogen dat een dobbelsteen kan hebben.
    private final int max = 6;

    //Het 
    private int currentValue;

    public Dobbelsteen(){
        currentValue = 1;
    }

    public int gooi(){
        currentValue = (int)(Math.random() * max) + 1;
        return currentValue;
    }

    public int getCurrentValue(){
        return currentValue;
    }

    @Override
    public String toString() {
        return Integer.toString(currentValue);
    }
}

