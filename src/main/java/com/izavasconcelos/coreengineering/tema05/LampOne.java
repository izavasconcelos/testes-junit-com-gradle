package com.izavasconcelos.coreengineering.tema05;

public class LampOne implements Lamp {
    @Override
    public void on() {
        System.out.println("A Lâmpada 1 está ligada!");
    }

    @Override
    public void off() {
        System.out.println("A Lâmpada 1 está desligada!");
    }
}
