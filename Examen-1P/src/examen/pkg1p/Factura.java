/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1p;

import java.io.Serializable;

/**
 *
 * @author Carlos
 */
public class Factura implements Serializable {
    String Empresa;

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Eempresa) {
        this.Empresa = Eempresa;
    }

    public int getIdFactura() {
        return IdFactura;
    }

    public void setIdFactura(int IdFactura) {
        this.IdFactura = IdFactura;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    public Factura(String Empresa, int IdFactura, double Monto) {
        this.Empresa = Empresa;
        this.IdFactura = IdFactura;
        this.Monto = Monto;
    }
    int IdFactura;
    double Monto; 
}
