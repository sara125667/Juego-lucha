package com.juego.model;

import com.juego.strategy.AtaqueMagico;

public class Mago extends Personaje {

    public Mago(String nombre) {

        super(nombre, new AtaqueMagico());
    }
}
