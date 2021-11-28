package com.edyodaassg.Assgn06;

public class ThreadSingleton
{
    // public instance initialized when loading the class
    private static final ThreadSingleton instance = new ThreadSingleton();

    private ThreadSingleton()
    {
        // private constructor
    }
    public static ThreadSingleton getInstance(){
        return instance;
    }
}
