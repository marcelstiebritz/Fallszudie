package com.example.fallszudie;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static User testuser = new User(3, "User1", "Password", "USER", "TestClient", "User1");
    public static Budget testbudget = new Budget("Budget 1", 200, 1);

    public Main() {
    }

    public static void main(String[] args) throws IOException {
        MySQLAccess acces = new MySQLAccess();
        boolean isRunning = true;

        while(isRunning) {
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();

            try {
                acces.startConnection();
            } catch (SQLException var11) {
                System.out.println(var11.getMessage());
            } catch (ClassNotFoundException var12) {
                System.out.println(var12.getMessage());
            }

            switch (command) {
                case "addUser":
                    try {
                        acces.addUser(testuser);
                    } catch (SQLException var10) {
                        System.out.println(var10.getMessage());
                    }
                    break;
                case "addBudget":
                    try {
                        acces.addBudget(testbudget);
                    } catch (SQLException var9) {
                        System.out.println(var9.getMessage());
                    }
                    break;
                case "getBudget":
                    try {
                        System.out.println(acces.getAllBudgetsByUser(testuser));
                    } catch (SQLException var8) {
                        System.out.println(var8.getMessage());
                    }
                    break;
                default:
                    System.out.println("No such command");
            }
        }

    }
}
