package com.edyodaassg.Assgn05;
import java.io.*;
import java.util.*;

public class CollectionComp
{
    public static void main(String[] args)
    {
        List<Integer> l = new ArrayList<>();

        l.add(3);
        l.add(5);
        l.add(18);
        l.add(4);
        l.add(6);

        int minimum = Collections.min(l);

        int maximum = Collections.max(l);

        if (minimum == maximum)
        {
            System.out.println("All elements are equal");
        }
        else
        {
            System.out.println("Min value of our list : "
                    + minimum);
            System.out.println("Max value of our list : "
                    + maximum);
        }
    }
}
