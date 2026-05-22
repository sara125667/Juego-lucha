package com.juego.model;

import com.juego.strategy.AtaqueArco;

public class Arquero extends Personaje {

    public Arquero(String nombre) {

        super(nombre, new AtaqueArco());
    }
}
