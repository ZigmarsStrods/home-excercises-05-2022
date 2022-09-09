package io.codelex.arithmetic.practice;

public class CozaLozaWoza {
    public static void main(String[] args) {
        for (int i = 1; i <= 110; i++) {
            StringBuilder outputStr = new StringBuilder(" ");
            if (i % 3 == 0) {
                outputStr.append("Coza");
            }
            if (i % 5 == 0) {
                outputStr.append("Loza");
            }
            if (i % 7 == 0) {
                outputStr.append("Woza");
            }
            if (outputStr.toString().equals(" ")) {
                outputStr.append(i);
            }
            if (i % 11 == 0) {
                outputStr.append("\n");
            }
            System.out.print(outputStr);
        }
    }
}
