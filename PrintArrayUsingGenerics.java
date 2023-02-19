package com.javagenerics;

public class PrintArrayUsingGenerics {

    public static <E> void toPrint(E[] Array){
        for(E element: Array){
            System.out.println(element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
       Integer[] intArray={ 1, 2, 4, 5, 7};
       Double[] doubleArray= { 2.2, 4.5, 6.7, 5.3, 7.8};
       Character[] characterArray = { 'a', 'v', 'd', 'e', 'u'};

       PrintArrayUsingGenerics.toPrint(intArray);
       PrintArrayUsingGenerics.toPrint(doubleArray);
       PrintArrayUsingGenerics.toPrint(characterArray);
    }
}
