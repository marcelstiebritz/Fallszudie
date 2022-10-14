package com.example.fallszudie;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.sql.Connection;

public abstract class BudgetpointUtility {
    public BudgetpointUtility() {
    }

    public abstract void addBudgetpoint(String var1, Connection var2);

    public abstract void removeBudgetPoint(String var1, Connection var2);

    public abstract void getBudget(String var1, Connection var2);
}
