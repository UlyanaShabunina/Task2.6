package ru.vsu.cs.course1;

import ru.vsu.cs.util.ArrayUtils;

import java.io.File;

public class Enter {
    public static int[] enter(String[] args) {

        int[] arr2 = new int[]{};
        if (args.length > 1) {
            File file = new File (args[1]);
            if (file.exists()) {
                arr2 = ArrayUtils.readIntArrayFromFile(args[1]);
            }
            else {
                System.err.println("Такого файла нет");
            }
        }

        return arr2;
    }
}
