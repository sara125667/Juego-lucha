package com.juego.juego;

import com.juego.model.Personaje;

public class JuegoLucha {

    private Personaje jugador1;
    private Personaje jugador2;

    public JuegoLucha(
            Personaje jugador1,
            Personaje jugador2
    ) {

        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void iniciarPelea() {

        System.out.println(
                "La pelea comienza entre "
                + jugador1.getNombre()
                + " y "
                + jugador2.getNombre()
        );

        while (
                jugador1.estaVivo()
                && jugador2.estaVivo()
        ) {

            turno(jugador1, jugador2);

            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        if (jugador1.estaVivo()) {

            System.out.println(
                    jugador1.getNombre()
                    + " ha ganado."
            );

        } else {

            System.out.println(
                    jugador2.getNombre()
                    + " ha ganado."
            );
        }
    }

    private void turno(
            Personaje atacante,
            Personaje defensor
    ) {

        atacante.atacar(defensor);

        System.out.println(
                defensor.getNombre()
                + " tiene "
                + defensor.getPuntosDeVida()
                + " HP"
        );
    }
}
