/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author jimmy
 */
import Modelo.Convertidor;
import java.util.Scanner;

public class VistaConvertidor {
    private double num1, numA;
    public double getCelsiusValueFromUser() {
        // Código para obtener el valor en grados Celsius desde la interfaz de usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el grado celsius a convertir: ");
        num1 = scanner.nextDouble();
        
        return num1;
        
    }

    public void displayResult(double result) {
        // Código para mostrar el resultado al usuario en la interfaz de usuario
       System.out.println("El resultado es: " + result);
    }
}

