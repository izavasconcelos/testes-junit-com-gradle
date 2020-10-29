package com.izavasconcelos.coreengineering.tema05;

public class OnOff {

    private boolean interrupter;

    public OnOff(Lamp lamp) {
        interrupter = false;
    }

    public static void main(String[] args) {

        Lamp firstLamp = new LampOne();
        Lamp secondLamp = new LampTwo();
        OnOff lampOne = new OnOff(firstLamp);
        OnOff lampTwo = new OnOff(secondLamp);
        //Liga
        lampOne.switchStateLamp(firstLamp);
        lampTwo.switchStateLamp(secondLamp);
        //Desliga
        lampOne.switchStateLamp(firstLamp);
        lampTwo.switchStateLamp(secondLamp);
    }

    public void switchStateLamp(Lamp lamp) {
        if (interrupter) {
            lamp.off();
        } else {
            lamp.on();
        }
        interrupter=!interrupter;
    }

    public boolean statusInterrupter(){
        return interrupter;
    }
}
