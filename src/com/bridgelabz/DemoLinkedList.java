package com.bridgelabz;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(56);
        numbers.add(30);
        numbers.add(70);
        System.out.println(numbers);

        numbers.add(2,40);
        System.out.println(numbers);

        List ascendingOrder = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(ascendingOrder);
    }
}
