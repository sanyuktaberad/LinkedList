package com.bridgelabz;

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(56);
        numbers.add(30);
        numbers.add(70);
        System.out.println(numbers);

        numbers.add(2,40);
        System.out.println(numbers);
    }
}
