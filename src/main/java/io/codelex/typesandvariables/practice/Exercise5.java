package io.codelex.typesandvariables.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise5 {
    public static void main(String[] args) {
        String str = "+" + "-".repeat(50) + "+";
        System.out.println(str);
        Map<String, String> teachersClasses = new LinkedHashMap<>() {
            {
                put("Mrs. Doubtfire", "Cooking");
                put("Terminator", "Shooting");
                put("Icarus", "Flying");
                put("Harry Potter", "Wizardly");
                put("Egīls Levits", "Politika");
                put("Lauris Reiniks", "Mūzika");
                put("Diāna Kubasova", "Modes");
                put("Aldis Gobzems", "Politika");
            }
        };
        int colNum = 1;
        for (String key : teachersClasses.keySet()) {
            System.out.printf("| %d | %26s | %15s |\n", colNum, teachersClasses.get(key), key);
            colNum++;
        }
        System.out.println(str);
    }
}
