package com.juego.strategy;

import java.util.Random;

public class AtaqueArco implements EstrategiaAtaque {

    private Random random = new Random();

    @Override
    public int atacar() {
        return random.nextInt(16) + 8;
    }
}
