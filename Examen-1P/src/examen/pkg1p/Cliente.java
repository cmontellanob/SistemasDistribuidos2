package examen.pkg1p;

import java.rmi.*;
import java.rmi.registry.*;
import java.util.Scanner;

public class Cliente{
    public static void main(String args[]){
	IOperacionesBanco operacionbanco;
      int idcliente;
	try {
	    operacionbanco=(IOperacionesBanco)Naming.lookup("rmi://localhost/Banco");
             System.out.println("Introduzca IdCliente");
            Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
            idcliente = entradaEscaner.nextInt(); //Invocamos un método sobre un objeto Scanner
	    
            Factura[] facturas=operacionbanco.calcuar(idcliente);
            System.out.println("------------Facturas Pendientes -----------");
	    for(Factura f:facturas)
            { System.out.print(f.getEmpresa()+"   ");
            System.out.print(f.getIdFactura()+"   ");
            System.out.println(f.getMonto());
            }
            System.out.println();
	    System.out.println();
	}
	catch (Exception e){
	    e.printStackTrace();
	}
    }
}

