package com.example.calculadoradegrados;

public class Farenheit {

    public static int toCelsius(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static int toKelvin(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273;
    }

}