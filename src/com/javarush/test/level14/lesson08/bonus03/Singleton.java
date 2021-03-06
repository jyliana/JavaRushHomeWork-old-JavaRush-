package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Inna on 8/21/15.
 */
public class Singleton
{
    private static Singleton instance;

    private Singleton()
    {
    }

    static Singleton getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}
