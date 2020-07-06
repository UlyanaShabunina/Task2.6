package ru.vsu.cs.course1;

import ru.vsu.cs.util.ArrayUtils;

import java.io.FileReader;
import java.io.FileWriter;



public class Console {

    public static void play(String[] args) throws Exception {
        FileWriter fileWriter = new FileWriter(args[2]);

        int[] arr = Enter.enter(args);
        arr = Task.process(arr);
        for (int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");
            String b = String.valueOf(arr[i]);
            fileWriter.write(b);
            fileWriter.write(" ");
        }
        fileWriter.close();


    }
}