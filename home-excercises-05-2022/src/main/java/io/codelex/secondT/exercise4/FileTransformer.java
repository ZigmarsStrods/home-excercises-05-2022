package io.codelex.secondT.exercise4;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class FileTransformer {

    private static final String path = "C:/Users/zigma/IdeaProjects/home-excercises-05-2022/home-excercises-05-2022/src/main/java/io/codelex/secondT/exercise4/";

    public static void main(String[] args) throws IOException {
        String fileName = "my first file";
        StringBuilder reversed = new StringBuilder(fileName);
        reversed.reverse();
        System.out.println(reversed);
        BufferedReader in = new BufferedReader(new FileReader(path + fileName + ".txt"));
        Stack<String> stackToReverse = new Stack<>();
        String line;
        while ((line = in.readLine()) != null) {
            stackToReverse.add(line);
        }
        BufferedWriter out = new BufferedWriter(new FileWriter(path + reversed + ".txt"));
        while (stackToReverse.size() > 0) {
            out.write(stackToReverse.pop() + "\n");
        }
        in.close();
        out.close();

    }
}
