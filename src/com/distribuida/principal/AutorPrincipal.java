package com.distribuida.principal;

import com.distrbuida.beans.Autor;

public class AutorPrincipal {
    public static void main(String[] args) {
    Autor autor = new Autor(1,"Mario","Benalcazar","Alemania","Av.rio blanco y rio negro","09945245663","mbenalcazar@gmail.com");
    System.out.println(autor.toString());
}
}
