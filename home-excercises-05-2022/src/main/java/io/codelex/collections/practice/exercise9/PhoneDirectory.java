package io.codelex.collections.practice.exercise9;

import java.util.*;


public class PhoneDirectory {
    private Map<Integer, PhoneEntry> data;


    public PhoneDirectory() {
        data = new TreeMap<>();
    }

    private int find(String name) {
        List<Map.Entry<Integer, PhoneEntry>> entriesFound = data.entrySet()
                .stream()
                .filter(phonentry -> phonentry.getValue().getName().equals(name))
                .toList();
        if (entriesFound.isEmpty()) {
            return -1;
        } else {
            return entriesFound.get(0)
                    .getKey();
        }
    }

    public String getNumber(String name) {
        int position = find(name);
        if (position == -1) {
            return "not in the phone list";
        } else {
            return data.get(position)
                    .getNumber();
        }
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        int key = find(name);
        if (key == -1) {
            data.put(data.size(), new PhoneEntry(name, number));
        } else {
            data.get(key)
                    .setNumber(number);
        }
    }

}
