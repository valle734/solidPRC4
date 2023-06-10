/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidconvertidor;

/**
 *
 * @author jimmy
 */
import Modelo.Convertidor;
import Controlador.ControladorConvertidor;
import Vista.VistaConvertidor;
        
public class SolidConvertidor {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convertidor model = new Convertidor();
        VistaConvertidor view = new VistaConvertidor();
        ControladorConvertidor controller = new ControladorConvertidor(model, view);

     view.getCelsiusValueFromUser();
        controller.converCelsiusAFahrenheit();
    }
    
}
