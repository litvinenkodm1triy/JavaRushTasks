package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        int i = 0;
        if (decimalNumber<=0) return "";

        String binaryNumber ="";
        while (decimalNumber != 0) {
            binaryNumber = (decimalNumber % 2) + binaryNumber;
            decimalNumber = decimalNumber / 2;
            i++;
        }
        return binaryNumber;
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber ==null|| binaryNumber.equals("")) return 0;

        int decimalNumber =0;
        for (int j = 0; j <binaryNumber.length(); j++) {
            decimalNumber = decimalNumber+(Integer.parseInt(String.valueOf(binaryNumber.charAt(binaryNumber.length()-j-1)))*(int)Math.pow(2,j));
            j++;
        }
        return decimalNumber;
    }
}
