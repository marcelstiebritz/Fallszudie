package com.example.fallszudie;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.sql.Connection;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BudgetUtility {
    public BudgetUtility() {
    }

    public static void addBudget(Budget budget, Connection connect) throws SQLException {
        PreparedStatement prepStmt = connect.prepareStatement("INSERT INTO Budgetdatabase values(?,?,?)");
        prepStmt.setInt(1, budget.getIDENTIFIER());
        prepStmt.setString(2, budget.getNAME());
        prepStmt.setInt(3, budget.getOVERALLBUDGETValue());
        prepStmt.executeUpdate();
    }

    public static String getBdudget(Connection connect, User user) throws SQLException {
        ResultSet rs = null;
        PreparedStatement prepStmt = connect.prepareStatement("SELECT * From TABLE (  Budgetdatabase) where Username = ?");
        prepStmt.setString(1, user.getUSERNAME());
        rs = prepStmt.executeQuery();

        String returnstring;
        int id;
        String name;
        int amount;
        String username;
        for(returnstring = ""; rs.next(); returnstring = "" + id + "\t\t" + name + "\t\t" + amount + username) {
            id = rs.getInt("Identifier");
            name = rs.getString("Name");
            amount = rs.getInt("Overall");
            username = rs.getString("Username");
        }

        System.out.println(returnstring);
        return returnstring;
    }

    public static void removeBudget(String budget, Connection connect) throws SQLException {
        PreparedStatement prepStmt = connect.prepareStatement("DELETE FROM Budgetdatabase WHERE Name = ?");
        prepStmt.setString(1, budget);
        prepStmt.executeUpdate();
    }
}
