package com.henco.assignment5;

/**
 * Created by Henco on 4/1/2017.
 */
public class AbstractFactoryRun
{

    public static void main(String[] args)
    {
        CarFactory audi = FactoryProducer.getCarFactory("Audi");
        Car rs6 = audi.createCar("RS6");
        rs6.drive();

        CarFactory vw = FactoryProducer.getCarFactory("Volkswagen");
        Car gti = vw.createCar("GTI");
        gti.drive();

        Car r8 = audi.createCar("R8");
        r8.drive();
        Car amarok = vw.createCar("Amarok");
        amarok.drive();
    }

}
