/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.domain;

/**
 * 
 * @author 
 */
public class Director extends Manager {

    private double budget;
    public Director(int empId, String name, String essn, double salary, String deptName, double budget) {
        super(empId, name, essn, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBudget:   " + getBudget();
    }    
}
