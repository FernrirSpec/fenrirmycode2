package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

            String[] str = new String[]{"Can't", "find", "texture" };

            String path = "C:\\Users\\St.Freon\\IdeaProjects\\untitled1\\src\\com\\company\\task_2.log";

            File file = new File(path);

            Scanner scanner = new Scanner(file);

            try
            {
                while (scanner.hasNextLine())
                {
                    String line1 = scanner.nextLine();

                    String[] words = line1.split("\\s");

                    for(int i = 0; i <= words.length-1; i++) {
                        if (words[i].equals(str[0])) {
                            for (int j = 0; j <= words.length - 1; j++) {
                                if (words[j].equals(str[1])) {
                                    for (int z = 0; z <= words.length - 1; z++) {
                                        if (words[z].equals(str[2])) {
                                            System.out.println(words[5]);
                                        }
                                    }
                                }
                            }
                        }
                    }

                }

            }

    finally {
                scanner.close();
            }

    }
}





















