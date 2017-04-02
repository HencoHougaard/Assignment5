package com.henco.assignment5;
/**
 * Created by Henco on 4/2/2017.
 */
public class PrototypeRun
{
    public static void main(String[] args)
    {
        CreateClone createClone = new CreateClone();
        Superhero superman = new Superhero();
        Superhero superhero = (Superhero) createClone.getClone(superman);

        System.out.println(superhero);
    }

}
