package com.example.fallszudie;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Budget {
    private final int IDENTIFIER;
    private final String NAME;
    private final int OVERALLBUDGET;

    public Budget(String name, int overallbudget, int identifier) {
        this.NAME = name;
        this.OVERALLBUDGET = overallbudget;
        this.IDENTIFIER = identifier;
    }

    public int getIDENTIFIER() {
        return this.IDENTIFIER;
    }

    public String getNAME() {
        return this.NAME;
    }

    public int getOVERALLBUDGETValue() {
        return this.OVERALLBUDGET;
    }

    public String toString() {
        return null;
    }
}
