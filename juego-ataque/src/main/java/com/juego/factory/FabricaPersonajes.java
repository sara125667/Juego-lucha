package com.juego.factory;

import com.juego.model.*;

public class FabricaPersonajes {

    public static Personaje crearPersonaje(
            String tipo,
            String nombre
    ) {

        switch (tipo.toLowerCase()) {

            case "guerrero":
                return new Guerrero(nombre);

            case "mago":
                return new Mago(nombre);

            case "arquero":
                return new Arquero(nombre);

            default:
                throw new IllegalArgumentException(
                        "Tipo inválido"
                );
        }
    }
}
