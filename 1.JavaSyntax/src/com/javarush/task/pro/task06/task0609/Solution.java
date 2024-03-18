package com.javarush.task.pro.task06.task0609;

/* 
Кубический калькулятор в кубе
*/

public class Solution {
    public static void main(String[] args) {
        long number = ninthDegree(cube(2));
        System.out.print("число в степени 9:" + number);

    }
    public static long cube(long a) {
        return a * a * a;
    }
    public static long ninthDegree(long cube) {
        return cube * cube * cube;
    }

}
