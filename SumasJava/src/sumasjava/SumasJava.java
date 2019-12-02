/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumasjava;

/**
 *
 * @author Carlos
 */
public class SumasJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=5;
        int b=6;
        int c=sumar(a,b);
        System.out.println(c);
                
    }

    private static int sumar(int a, int b) {
        operaciones.Operaciones_Service service = new operaciones.Operaciones_Service();
        operaciones.Operaciones port = service.getOperacionesPort();
        return port.sumar(a, b);
    }
    
}
