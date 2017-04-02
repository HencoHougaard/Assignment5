package com.henco.assignment5;
/**
 * Created by Henco on 4/1/2017.
 */
public class Apple
{
    private static Apple appleInstance = new Apple();

    private Apple()
    {

    }

    public static Apple getInstance()
    {
        return appleInstance;
    }
}
