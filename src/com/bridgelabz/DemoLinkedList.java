package com.bridgelabz;

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(56);
        numbers.add(30);
        numbers.add(70);
        System.out.println(numbers);
        for (int i =0; i < numbers.size()-1;i++ ){
            if (numbers.get(i)!= 0 && numbers.get(i) == 30){
                        System.out.println(numbers.get(i-1)+ " is node and value is  "+numbers.get(i));
            }
        }
    }
}
