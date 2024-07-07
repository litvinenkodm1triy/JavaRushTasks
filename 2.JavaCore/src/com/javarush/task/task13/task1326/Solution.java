package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileame = reader.readLine();
        FileInputStream stream = new FileInputStream(fileame);
        Scanner scanner = new Scanner(stream);
        int number;
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                list.add(number);
            }
        }
        Collections.sort(list);
        System.out.println(list.toString());
        stream.close();
    }
}
