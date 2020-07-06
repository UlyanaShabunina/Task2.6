package ru.vsu.cs.course1;

import ru.vsu.cs.util.SwingUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.ROOT);

        if (args.length == 0){
            System.err.println("Вы не ввели аргументы, пожалуйста введите аргументы и запустите снова");
            return;
        }
        String arg = args[0].toLowerCase(Locale.ENGLISH);

        if (!"console".equals(arg) & !"window".equals(arg)){
            System.err.println("Введены некорректные аргументы, пожалуйста введите корректные аргументы и повротите запуск");
            return;
        }

        if ("window".equals(arg)){
            SwingUtils.setDefaultFont("Microsoft Sans Serif", 18);
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    (new FrameMain(args)).setVisible(true);

                }
            });
            return;
        }


        if (args.length!=3){
            System.err.println("Введены неполные аргументы");
            return;
        }



        if ("console".equals(arg)) {
            Console console = new Console();
            console.play(args);
        }
    }
}

