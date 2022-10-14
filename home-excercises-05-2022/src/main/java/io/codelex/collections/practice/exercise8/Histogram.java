package io.codelex.collections.practice.exercise8;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    private static final String star = "*";

    private static final int maxScore = 100;

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        List<Integer> scoresList = Arrays.stream(scores.split(" "))
                .map(Integer::parseInt).toList();
        for (int i = 0; i <= maxScore; i += 10) {
            int lowerLimit = i;
            int upperLimit = lowerLimit + 9;
            long scoreCount = scoresList.stream()
                    .filter(j -> j >= lowerLimit && j <= upperLimit)
                    .count();
            String output = String.format("%02d", lowerLimit);
            if (lowerLimit < maxScore) {
                output += String.format("-%02d", upperLimit);
            }
            System.out.println(output + ":" + star.repeat((int) scoreCount));
        }


    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
