package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AutorTestUnitaria {
    private Autor autor;

    @BeforeEach
    public void setUp() {
        autor = new Autor(1,"Mario","Benalcazar","Alemania","Av.rio blanco y rio negro","09945245663","mbenalcazar@gmail.com");
    }
    @Test
    public void testAutorConstructor() {
        assertAll("Validar datos Autor - Constructor",
                ()-> assertEquals(1,autor.getIdAutor()),
                ()-> assertEquals("Mario",autor.getNombre()),
                ()-> assertEquals("Benalcazar",autor.getApellido()),
                ()-> assertEquals("Alemania",autor.getPais()),
                ()-> assertEquals("Av.rio blanco y rio negro",autor.getDireccion()),
                ()-> assertEquals("09945245663",autor.getTelefono()),
                ()-> assertEquals("mbenalcazar@gmail.com",autor.getCorreo())

                );

    }
    @Test
    public void testAutorSetters() {
        autor.setIdAutor(2);
        autor.setNombre("Mario2");
        autor.setApellido("Benalcazar2");
        autor.setPais("Alemania2");
        autor.setDireccion("Av.rio2");
        autor.setTelefono("0994524566322");
        autor.setCorreo("mbenalcazar@gmail.com22");

        assertAll("Validar datos Autor - Setters",
                ()-> assertEquals(2,autor.getIdAutor()),
                ()-> assertEquals("Mario2",autor.getNombre()),
                ()-> assertEquals("Benalcazar2",autor.getApellido()),
                ()-> assertEquals("Alemania2",autor.getPais()),
                ()-> assertEquals("Av.rio2",autor.getDireccion()),
                ()-> assertEquals("0994524566322",autor.getTelefono()),
                ()-> assertEquals("mbenalcazar@gmail.com22",autor.getCorreo())
        );

    }
    @Test
    public void testAutorToString() {
        String str = autor.toString();
        assertAll("Validar datos autor- To String",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Mario")),
                () -> assertTrue(str.contains("Benalcazar")),
                () -> assertTrue(str.contains("Alemania")),
                () -> assertTrue(str.contains("Av.rio blanco y rio negro")),
                () -> assertTrue(str.contains("09945245663")),
                () -> assertTrue(str.contains("mbenalcazar@gmail.com"))

        );
    }
}
