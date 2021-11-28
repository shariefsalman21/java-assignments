package com.edyodaassg.Assgn07;
import java.util.*;
public class Stream_MaxValElem {
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int max =  myList.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);
    }
}
