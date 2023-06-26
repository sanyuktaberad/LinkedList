package com.bridgelabz;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(56);
        numbers.add(70);
        System.out.println(numbers);

        numbers.add(1,30);
        System.out.println(numbers);


    }
}
