package galeyo.tutorial.beginer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("beginer/sum/input.txt");
        List<List<Integer>> lines = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        if (inputStream != null) {
            Scanner scanner = new Scanner(inputStream);
                while (scanner.hasNextLine()) {
                    while(scanner.hasNextInt()) {
                        integers.add(scanner.nextInt());
                    }
                    lines.add(integers);
                }
        } else {
            System.out.println("File not found!");
        }
        // Write code here...

    }
}