package com.distribuida.principal;

import com.distrbuida.beans.Cliente;
import com.distrbuida.beans.Factura;
import com.distrbuida.beans.FacturaDetalle;

import java.util.Date;

public class FacturaDetallePrincipal {
    public static void main(String[] args) {
        FacturaDetalle  facturaDetalle = new FacturaDetalle();
        Factura factura = new Factura(1, "FAC-001", new Date(), 100.00, 15.00, 115.00, 1);

        facturaDetalle.setIdFacturadetalle(1);
        facturaDetalle.setCantidad(20);
        facturaDetalle.setSubtotal(200.00);
        factura.setIdFactura(1);
        factura.setNumFactura("FAC-0001");
        factura.setFecha(new Date());
        factura.setTotalNeto(100.00);
        factura.setIva(15.00);
        factura.setTotal(115.00);
        facturaDetalle.setFactura(factura);
        Cliente cliente = new Cliente(1,"1751839067","Juan","Taipe","Av. por ahi y mas alla","0994450452","jtaipe@gmail.com");
        factura.setCliente(cliente);

        System.out.println(facturaDetalle.toString());
    }
}
