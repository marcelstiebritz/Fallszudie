package com.example.fallszudie;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.sql.SQLException;

public class BudgetMain {
    public BudgetMain() {
    }

    public static void main(String[] args) {
        MySQLAccess acces = new MySQLAccess();
        Budget testbudget = new Budget("Test123", 12000, 1);

        try {
            acces.startConnection();
            acces.addBudget(testbudget);
            acces.removeBudget(testbudget.getNAME());
            acces.closeConnection();
        } catch (ClassNotFoundException var4) {
            System.out.println(var4.getMessage());
        } catch (SQLException var5) {
            System.out.println(var5.getMessage());
            System.out.println();
        }

    }
}
