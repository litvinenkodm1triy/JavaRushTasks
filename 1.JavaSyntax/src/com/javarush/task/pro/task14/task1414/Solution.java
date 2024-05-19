package com.javarush.task.pro.task14.task1414;

/* 
Готовим коктейли
*/

public class Solution {

    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        Thread current=Thread.currentThread();
        StackTraceElement[] elements =current.getStackTrace();
        for (var elem:elements) {
            System.out.println("Метод "+elem.getMethodName()+" вызван из строки "+elem.getLineNumber()
            +" класса "+elem.getClass()+" в файле "+elem.getFileName());
        }
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
