package com.bridgelabz;

import java.util.LinkedList;
import java.util.Scanner;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(56);
        numbers.add(30);
        numbers.add(70);
        System.out.println(numbers);

        numbers.add(2,40);
        System.out.println(numbers);

        numbers.remove(2);
        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}
