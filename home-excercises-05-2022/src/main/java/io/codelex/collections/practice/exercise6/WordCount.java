package io.codelex.collections.practice.exercise6;


import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.ToIntFunction;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(WordCount.class.getResource(file).toURI());
        List<String> textAsList = Files.readAllLines(path, charset);
        System.out.println("Lines = " + textAsList.size());
        int words = listStreamMapIntSum(textAsList, line -> line.toString().split("[\\s,!?]+").length);
        System.out.println("Words = " + words);
        int chars = listStreamMapIntSum(textAsList, line -> line.toString().length());
        System.out.println("Chars = " + chars);
    }

    private static int listStreamMapIntSum(List<String> list, ToIntFunction mapper) {
        return list.stream()
                .mapToInt(mapper)
                .sum();
    }
}
