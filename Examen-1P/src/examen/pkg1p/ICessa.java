/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1p;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Carlos
 */
public interface ICessa extends Remote {
    public Factura[] pedientes(int idcliente) throws RemoteException;
    public String pagar(Factura[] facturas) throws RemoteException;
    
}
