package com.bridgelabz;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(56);
        numbers.add(30);
        numbers.add(70);
        System.out.println(numbers);

        numbers.pollLast();
        System.out.println(numbers);
    }
}
