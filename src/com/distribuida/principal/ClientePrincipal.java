package com.distribuida.principal;

import com.distrbuida.beans.Cliente;

public class ClientePrincipal {

    public static void main (String[] args){
        Cliente cliente = new Cliente(1,"1751839067","Juan","Taipe","Av. por ahi y mas alla","0994450452","jtaipe@gmail.com");
        System.out.println(cliente.toString());
    }
}
