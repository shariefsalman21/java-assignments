package com.edyodaassg.Assgn07;
import java.util.*;
import java.util.stream.*;

public class Stream_Start1 {
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream()
                .map(s -> s + "") // Convert integer to String
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);
    }
}
