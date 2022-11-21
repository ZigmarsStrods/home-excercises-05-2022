package io.codelex.enums.practice.exercise2;

public enum SPT {
    T("Stone"),
    P("Paper"),
    S("Scissors");

    private String name;

    SPT(String name) {
        this.name = name;
    }

    public static SPT getSPTfromInt(int inputInt) {
        for (SPT check : SPT.values()) {
            if (check.ordinal() == inputInt) {
                return check;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}
