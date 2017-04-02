package com.henco.assignment5;

/**
 * Created by Henco on 4/1/2017.
 */
public class Audi implements CarFactory
{
    @Override
    public Car createCar(String carType)
    {
        if("RS6".equalsIgnoreCase(carType))
        {
            return new RS6();
        }
        if("R8".equalsIgnoreCase(carType))
        {
            return new R8();
        }
        return null;
    }
}
