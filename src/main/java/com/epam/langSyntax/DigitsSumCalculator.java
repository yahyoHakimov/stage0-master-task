package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
            int n1 = number / 1000; // first digit of number
            int n2 = (number / 100) % 10; // second digit of number
            int n3 = ((number / 10) % 10) ; // third digit of number
            int n4 = number % 10; //last digit of number

            System.out.println( number >= 1000 && number <= 9999 ? (n1 + n2 + n3 + n4) : 0);
    }

}
