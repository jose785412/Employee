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
public class Manager extends Employee{
    
    private String deptName;

    public Manager(int empId, String name, String essn, double salary, String deptName) {
        super(empId, name, essn, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
    public String toString() {
        return super.toString() + "\nDepartamento:   " + getDeptName();
    }
}
