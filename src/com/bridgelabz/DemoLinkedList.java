package com.bridgelabz;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(56);
        numbers.add(30);
        numbers.add(70);

        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i <= numbers.size()-1 ; i++){
            linkedList.add(numbers.get(i));
        }
        System.out.println(linkedList);
    }
}
