package com.henco.assignment5;

/**
 * Created by Henco on 4/1/2017.
 */
public class FactoryProducer
{
    public static CarFactory getCarFactory(String factoryType)
    {
        if("Audi".equalsIgnoreCase(factoryType))
        {
            return new Audi();
        }
        if("Volkswagen".equalsIgnoreCase(factoryType))
        {
            return new Volkswagen();
        }
        return null;
    }
}
