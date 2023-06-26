package com.bridgelabz;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(70);
        numbers.add(30);
        numbers.add(56);

        List<Integer> reverseOrder = new LinkedList<>();

        for (int i = numbers.size()-1; i >= 0 ; i--){
            reverseOrder.add(numbers.get(i));
        }
        System.out.println(reverseOrder);
    }
}
