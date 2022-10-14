package com.example.fallszudie;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLAccess {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public MySQLAccess() {
    }

    public void startConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        this.connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/Fallstudie", "root", "Bond.007!");
    }

    public void closeConnection() throws SQLException {
        this.connect.close();
    }

    public void addUser(User user) throws SQLException {
        UserUtility.addUser(user, this.connect);
    }

    public void removeUser(String userName) throws SQLException {
        UserUtility.removeUser(userName, this.connect);
    }

    public User getUser(String userName) throws SQLException {
        return UserUtility.getUser(userName, this.connect);
    }

    public void addBudget(Budget budget) throws SQLException {
        BudgetUtility.addBudget(budget, this.connect);
    }

    public void removeBudget(String budget) throws SQLException {
        BudgetUtility.removeBudget(budget, this.connect);
    }

    public String getAllBudgetsByUser(User user) throws SQLException {
        return BudgetUtility.getBdudget(this.connect, user);
    }

    public void addBudgetBoint() {
    }

    private void calculateBudget() {
    }
}
