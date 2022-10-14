package com.example.fallszudie;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserUtility {
    public UserUtility() {
    }

    public static User getUser(String userName, Connection connect) throws SQLException {
        PreparedStatement prepaStmt = connect.prepareStatement("SELECT Username FROM Userdatabase WHERE Username = ?");
        prepaStmt.setString(1, userName);
        ResultSet result = prepaStmt.executeQuery();

        User returnUser;
        for(returnUser = null; result.next(); returnUser = new User(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6))) {
        }

        return returnUser;
    }

    public static void addUser(User user, Connection connect) throws SQLException {
        PreparedStatement prepStmt = connect.prepareStatement("INSERT INTO Userdatabase values(?,?,?,?,?,?)");
        prepStmt.setInt(1, user.getIDENTIFIER());
        prepStmt.setString(2, user.getNAME());
        prepStmt.setString(3, user.getPASSWORDHASH());
        prepStmt.setString(4, user.getROLE());
        prepStmt.setString(5, user.getCLIET());
        prepStmt.setString(6, user.getUSERNAME());
        prepStmt.executeUpdate();
    }

    public static void removeUser(String userName, Connection connect) throws SQLException {
        PreparedStatement prepStmt = connect.prepareStatement("DELETE FROM Userdatabase WHERE Username = ?");
        prepStmt.setString(1, userName);
        prepStmt.executeUpdate();
    }
}
