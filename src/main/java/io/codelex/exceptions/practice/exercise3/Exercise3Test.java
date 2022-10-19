package io.codelex.exceptions.practice.exercise3;

import java.io.File;
import java.io.IOException;

public class Exercise3Test {
    public static void main(String[] args) throws IOException {

        File notExistingFile = new File("somewhere/over/rain/bow");
        Exercise3.cat(notExistingFile);

    }
}
