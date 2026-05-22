package com.juego.strategy;

import java.util.Random;

public class AtaqueEspada implements EstrategiaAtaque {

    private Random random = new Random();

    @Override
    public int atacar() {
        return random.nextInt(21) + 10;
    }
}
