package com.distribuida.principal;

import com.distrbuida.beans.Autor;
import com.distrbuida.beans.Categoria;
import com.distrbuida.beans.Libro;

public class LibroPrincipal {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setIdLibro(1);
        libro1.setTitulo("La dama tapada");
        libro1.setEditorial("la noche oscura");
        libro1.setNumeroPaginas(100);
        libro1.setEdicion("ISMAC SOFTWARE");
        libro1.setIdioma("Español");
        libro1.setFecha_de_publicacion("12-11-2025");
        libro1.setDescripcion("es un relato hecho para los hombres borrachos");
        libro1.setTipo_de_pasta("TRANS");
        libro1.setIsbn("123456789");
        libro1.setNum_ejemplares(10);
        libro1.setPortada("Vestido de negro");
        libro1.setPresentacion("libro x 100pag");
        libro1.setPrecio(12.50);
        Categoria categoria = new Categoria(1, "Infantil", "relato real antepasado");
        libro1.setCategoria(categoria);
        Autor autor = new Autor(1, "Mario", "Benalcazar", "Alemania", "Av.rio blanco y rio negro", "09945245663", "mbenalcazar@gmail.com");
        libro1.setAutor(autor);
        System.out.println(libro1.toString());

    }
}
