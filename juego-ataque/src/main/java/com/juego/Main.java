package com.juego;

import com.juego.factory.FabricaPersonajes;
import com.juego.juego.JuegoLucha;
import com.juego.model.Personaje;

public class Main {

    public static void main(String[] args) {

        Personaje jugador1 =
                FabricaPersonajes.crearPersonaje(
                        "guerrero",
                        "Thor"
                );

        Personaje jugador2 =
                FabricaPersonajes.crearPersonaje(
                        "mago",
                        "Loki"
                );

        JuegoLucha juego =
                new JuegoLucha(jugador1, jugador2);

        juego.iniciarPelea();
    }
}
