package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()))) {
            StringBuilder builder =new StringBuilder();
            String s ="";
            int i = 0;
            while (!s.equals("exit")){
                s = reader.readLine();
                if (i == 0) {
                    builder.append(s).append("\n");
                }
                else {
                    builder.append(s).append("\n");
                    writer.write(builder.toString());
                }
                i++;
            }
        }
    }
}
