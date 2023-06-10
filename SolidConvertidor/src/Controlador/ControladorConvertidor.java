/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Convertidor;
import Vista.VistaConvertidor;
/**
 *
 * @author jimmy
 */
public class ControladorConvertidor {
    private Convertidor converter;
    private VistaConvertidor view;

    public ControladorConvertidor(Convertidor converter, VistaConvertidor view) {
        this.converter = converter;
        this.view = view;
    }

    public void converCelsiusAFahrenheit() {
        double celsius = view.getCelsiusValueFromUser();
        double fahrenheit = converter.converCelsiusAFahrenheit(celsius);
        view.displayResult(fahrenheit);
    }

    public void convertFahrenheitToCelsius() {
        double fahrenheit = view.getCelsiusValueFromUser();
        double celsius = converter.converFahrenheitACelsius(fahrenheit);
        view.displayResult(celsius);
    }
}