package com.henco.assignment5;

/**
 * Created by Henco on 4/1/2017.
 */

public class Volkswagen implements CarFactory
{


    @Override
    public Car createCar(String carType)
    {
        if("GTI".equalsIgnoreCase(carType))
        {
            return new GTI();
        }
        if("Amarok".equalsIgnoreCase(carType))
        {
            return new Amarok();
        }
        return null;
    }
}
