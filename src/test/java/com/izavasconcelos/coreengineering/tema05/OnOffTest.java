package com.izavasconcelos.coreengineering.tema05;

import org.junit.Test;

import static org.junit.Assert.*;

public class OnOffTest {
    @Test
    public void lampOneTest() {

        Lamp firstLamp = new LampOne();
        OnOff lampOne = new OnOff(firstLamp);
        //Liga
        lampOne.switchStateLamp(firstLamp);
        assertTrue(lampOne.statusInterrupter());
        //Desliga
        lampOne.switchStateLamp(firstLamp);
        assertFalse(lampOne.statusInterrupter());
    }

    @Test
    public void lampTwoTest() {
        Lamp secondLamp = new LampTwo();
        OnOff lampTwo = new OnOff(secondLamp);
        //Liga
        lampTwo.switchStateLamp(secondLamp);
        assertTrue(lampTwo.statusInterrupter());
        //Desliga
        lampTwo.switchStateLamp(secondLamp);
        assertFalse(lampTwo.statusInterrupter());
    }
}