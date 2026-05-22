package com.juego.model;

import com.juego.strategy.AtaqueEspada;

public class Guerrero extends Personaje {

    public Guerrero(String nombre) {

        super(nombre, new AtaqueEspada());
    }
}
