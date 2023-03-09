package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        if (number > 100 && number < 999) {
            int m = number / 100;
            int k = (number / 10 ) % 10;
            int n = number % 10;
            System.out.println(n + "" + k + "" + "" + m);
        }
    }

}
