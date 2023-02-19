package com.javagenerics;

public class PrintArray {
    public static void toPrint(Integer[] Array){
        for(int element : Array){
            System.out.println(element);
        }
        System.out.println();
    }
    public static void toPrint(Double[] Array){
        for(Double element : Array){
            System.out.println(element);
        }
        System.out.println();
    }
    public static void toPrint(Character[] Array){
        for(Character element : Array){
            System.out.println(element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
          Integer[] intArray = { 1, 2, 3, 4, 5};
          Double[] doubleArray = { 1.3, 2.2, 4.5, 6.5, 4.3 };
          Character[] characterArray = { 'a', 'c', 'r', 'p', 'g'};

          PrintArray.toPrint(intArray);
          PrintArray.toPrint(doubleArray);
          PrintArray.toPrint(characterArray);
    }
}
