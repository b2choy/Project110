package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature {

    public Celsius(float t) {
        super(t);
    }

    @java.lang.Override
    public Temperature toCelsius() {
        return this;
    }

    @java.lang.Override
    public Temperature toFahrenheit() {
        float value = ((this.getValue()*9)/5) + 32;
        return new Fahrenheit(value);
    }

    public String toString() {
        //TODO: Complete this method
        return this.getValue() + " C";
    }

}
