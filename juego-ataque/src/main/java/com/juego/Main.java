package com.juego;

public class Main {
    public static void main(String[] args) {

        int vidaThor = 100;
        int vidaLoki = 100;

        System.out.println("Estado inicial:");
        System.out.println("Thor tiene " + vidaThor + " HP");
        System.out.println("Loki tiene " + vidaLoki + " HP");

        while (vidaThor > 0 && vidaLoki > 0) {

            vidaLoki -= 10;
            vidaThor -= 8;

            System.out.println("Thor ataca a Loki");
            System.out.println("Vida Loki: " + vidaLoki);

            System.out.println("Loki ataca a Thor");
            System.out.println("Vida Thor: " + vidaThor);

            System.out.println("-------------------");
        }

        if (vidaThor <= 0 && vidaLoki <= 0) {
            System.out.println("Empate");
        } else if (vidaThor > vidaLoki) {
            System.out.println("Gana Thor ⚡");
        } else {
            System.out.println("Gana Loki 🐍");
        }
    }
}
