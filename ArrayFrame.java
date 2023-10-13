package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayFrame {
    public static void main(String[] args) {
//        ArrayList<Integer> l1 = new ArrayList<>();
//        ArrayList<Integer> l2 = new ArrayList<>();
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(1);
        l2.add(3);
        l2.add(8);
        l2.add(7);

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        l1.addAll(l2);

        l1.remove(4);
        for(int i = 0 ; i<l1.size() ; i++){
            System.out.println(l1.get(i)+" ");
        }
        System.out.println("ArraList: "+l1.get(3));
    }
}
