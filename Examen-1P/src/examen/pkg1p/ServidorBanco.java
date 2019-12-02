package examen.pkg1p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.Socket;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ServidorBanco 
    extends UnicastRemoteObject
    implements IOperacionesBanco
	 
{
    ServidorBanco() throws java.rmi.RemoteException{
	super();
    }

    @Override
    public Factura[] calcuar(int idcliente) throws RemoteException {
        ICessa cessa;
        Factura[] facturas=null;
        int port = 5001; // puerto de comunicacion
        try {
            cessa=(ICessa)Naming.lookup("rmi://localhost/CESSA");
            Factura[] facturasCessa=cessa.pedientes(idcliente);
            facturas=facturasCessa;
            String cadena = "fac-"+idcliente;
            Socket client = new Socket("localhost", port); //conectarse al socket
            PrintStream toServer = new PrintStream(client.getOutputStream());
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            toServer.println(cadena);  //mandar alservidor 
            String resultado = fromServer.readLine();  // devolver del servidor
            String [] facs=resultado.split(",");
            Factura[] facturasElapas = new Factura[ facs.length  ];
              int i=0;
            for (String f:facs )
        {
            String[] factu=f.split("-");
            int IdFactura=Integer.parseInt(factu[0]);
            double monto=Integer.parseInt(factu[1]);
            facturasElapas[i]=new Factura("Elapas",IdFactura,monto);
            i++;
        }
         Factura[] facturasPendientes = new Factura[ facturasCessa.length + facturasElapas.length ];
        System.arraycopy( facturasCessa, 0, facturasPendientes, 0, facturasCessa.length );
        System.arraycopy( facturasElapas, 0, facturasPendientes, facturasCessa.length, facturasElapas.length );
        facturas=facturasPendientes;

        }    
            catch(IOException e){
            System.out.println(e.getMessage());
        }
         catch (NotBoundException ex) {
            Logger.getLogger(ServidorBanco.class.getName()).log(Level.SEVERE, null, ex);
        } 

        
        return facturas; 
    }

    @Override
    public String pagar(Factura[] facturas) throws RemoteException {
        return "pagado";
    }

        public static void main(String args[]) { 
	try {
	    LocateRegistry.createRegistry(1099);
	    ServidorBanco banco=new ServidorBanco(); 
	    Naming.bind("Banco", banco); 
            System.out.println("El servidor esta listo\n");
        }
	catch (Exception e){
	    e.printStackTrace();
	}
    } 

    
}


