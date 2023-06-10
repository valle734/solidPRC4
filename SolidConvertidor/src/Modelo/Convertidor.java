/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jimmy
 */
    public class Convertidor {
    public double converCelsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double converFahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    
}
    
}
