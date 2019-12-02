/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumircotizacionjava;

/**
 *
 * @author Carlos
 */
public class ConsumirCotizacionJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fecha="1/11/2019";
        System.out.print(obtenerCotizacion(fecha));
        
    }

    private static double obtenerCotizacion(java.lang.String fecha) {
        consumircotizacionjava.BancoCentral_Service service = new consumircotizacionjava.BancoCentral_Service();
        consumircotizacionjava.BancoCentral port = service.getBancoCentralPort();
        return port.obtenerCotizacion(fecha);
    }
    
}
