package com.example.calculadoradegrados;

public class Celsius {

    public static int toFahrenheit(int celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static int toKelvin(int celsius) {
        return celsius + 273;
    }

}