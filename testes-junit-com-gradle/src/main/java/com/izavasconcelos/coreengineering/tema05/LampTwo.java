package com.izavasconcelos.coreengineering.tema05;

public class LampTwo implements Lamp{
    @Override
    public void on() {
        System.out.println("A Lâmpada 2 está ligada!");
    }

    @Override
    public void off() {
        System.out.println("A Lâmpada 2 está desligada!");
    }
}
