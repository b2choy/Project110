package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature{

    public Fahrenheit(float t) {
        super(t);
    }

    @java.lang.Override
    public Temperature toCelsius() {
        float value = ((this.getValue() - 32)*5) / 9;
        return new Celsius(value);
    }

    @java.lang.Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString() {

        //TODO: Complete this method
        return this.getValue() + " F";
    }
}
