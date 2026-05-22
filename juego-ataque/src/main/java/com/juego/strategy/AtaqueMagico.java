package com.juego.strategy;

import java.util.Random;

public class AtaqueMagico implements EstrategiaAtaque {

    private Random random = new Random();

    @Override
    public int atacar() {
        return random.nextInt(31) + 15;
    }
}
