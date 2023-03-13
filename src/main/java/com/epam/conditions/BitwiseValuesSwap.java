package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        first = second;
        second= first;
        System.out.println(first + "\n"+ second);
    }

    public void method(int first,int second) {
        second = first;
        first = second;
    }

}
