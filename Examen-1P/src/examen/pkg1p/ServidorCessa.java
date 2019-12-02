package examen.pkg1p;

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;


public class ServidorCessa 
    extends UnicastRemoteObject
    implements ICessa
	 
{
    ServidorCessa() throws java.rmi.RemoteException{
	super();
    }

    @Override
    public Factura[] pedientes(int idcliente) throws RemoteException {
        Factura[] aux=null;
        switch (idcliente){
            case 1:
            aux=new Factura[3];
            aux[0]=new Factura("Cessa",154,50.00);
            aux[1]=new Factura("Cessa",326,70.00);
            aux[2]=new Factura("Cessa",572,90.00);
            
            break;
            case 2:
            aux=new Factura[2];
            aux[0]=new Factura("Cessa",325,60.00);
            aux[1]=new Factura("Cessa",457,80.00);
                break;
        }
        return aux;
    }

    @Override
    public String pagar(Factura[] facturas) throws RemoteException {
    return "Pago";    
    }

        public static void main(String args[]) { 
	try {
	    ServidorCessa cessa=new ServidorCessa(); 
	    Naming.bind("CESSA", cessa); 
            System.out.println("El servidor esta listo\n");
        }
	catch (Exception e){
	    e.printStackTrace();
	}
    } 
}


