package com.example.fallszudie;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class User {
    private final int IDENTIFIER;
    private final String NAME;
    private final String PASSWORDHASH;
    private final String ROLE;
    private final String ClCLIET;
    private final String USERNAME;

    public User(int identifier, String NAME, String PASSWORDHASH, String ROLE, String CLIET, String USERNAME) {
        this.IDENTIFIER = identifier;
        this.NAME = NAME;
        this.PASSWORDHASH = PASSWORDHASH;
        this.ROLE = ROLE;
        this.ClCLIET = CLIET;
        this.USERNAME = USERNAME;
    }

    public String getNAME() {
        return this.NAME;
    }

    public String getUSERNAME() {
        return this.USERNAME;
    }

    public String getPASSWORDHASH() {
        return this.PASSWORDHASH;
    }

    public String getROLE() {
        return this.ROLE;
    }

    public String getCLIET() {
        return this.ClCLIET;
    }

    public int getIDENTIFIER() {
        return this.IDENTIFIER;
    }

    public String toString() {
        return "User{IDENTIFIER=" + this.IDENTIFIER + ", NAME='" + this.NAME + "', PASSWORDHASH='" + this.PASSWORDHASH + "', ROLE='" + this.ROLE + "', ClCLIET='" + this.ClCLIET + "', USERNAME='" + this.USERNAME + "'}";
    }
}
