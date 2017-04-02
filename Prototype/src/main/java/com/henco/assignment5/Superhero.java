package com.henco.assignment5;

/**
 * Created by Henco on 4/2/2017.
 */
public class Superhero implements Person
{
    public Superhero()
    {
        System.out.println("Superhero is created");
    }

    public Person makeCopy()
    {
        System.out.println("A superhero is being born");

        Superhero superhero = null;
        try {
            superhero = (Superhero) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return superhero;
    }

    @Override
    public String toString() {
        return "I am Superman";
    }
}
