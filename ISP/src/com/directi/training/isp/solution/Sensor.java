package com.directi.training.isp.exercise;

import java.util.Random;

public class Sensor
{
    public void register(Iproximitycallback callback)
    {
        while (true) {
            if (isPersonClose()) {
                callback.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
