package com.juego.model;

import com.juego.strategy.EstrategiaAtaque;

public abstract class Personaje {

    protected String nombre;
    protected int puntosDeVida;
    protected EstrategiaAtaque estrategiaAtaque;

    public Personaje(String nombre, EstrategiaAtaque estrategiaAtaque) {

        this.nombre = nombre;
        this.puntosDeVida = 100;
        this.estrategiaAtaque = estrategiaAtaque;
    }

    public void atacar(Personaje oponente) {

        int dano = estrategiaAtaque.atacar();

        oponente.recibirDano(dano);

        System.out.println(
                nombre + " ataca a "
                + oponente.getNombre()
                + " causando "
                + dano
                + " puntos de daño."
        );
    }

    public void recibirDano(int dano) {

        if (dano < 0) return;

        puntosDeVida -= dano;

        if (puntosDeVida < 0) {
            puntosDeVida = 0;
        }
    }

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }
}
