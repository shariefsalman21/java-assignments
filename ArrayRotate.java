package com.edyodaassg.Assgn05;
import java.util.*;

public class ArrayRotate
{
    public static void main(String[] args)
    {
        // creating ArrayList
        List<Integer> my_list = new ArrayList<>();
        my_list.add(10);
        my_list.add(20);
        my_list.add(30);
        my_list.add(40);
        my_list.add(50);
        my_list.add(60);
        my_list.add(70);

        System.out.println("List Before Rotation : " + Arrays.toString(my_list.toArray()));

        for (int i = 0; i < 4; i++) {

            int temp = my_list.get(6);

            for (int j = 6; j > 0; j--) {
                my_list.set(j, my_list.get(j - 1));
            }
            my_list.set(0, temp);
        }

        // Printing list after rotation
        System.out.println(
                "List After Rotation :  "
                        + Arrays.toString(my_list.toArray()));
    }
}
