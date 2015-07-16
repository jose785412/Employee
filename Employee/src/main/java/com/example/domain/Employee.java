/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.domain;

import java.text.NumberFormat;

/**
 * 
 * @author 
 */
public class Employee {

    private int empId;
    private String name;
    private String essn;
    private double salary;
    
    public Employee( int empId, String name, String essn, double salary) {
        
        this.empId  = empId;
        this.name = name;
        this.essn = essn;
        this.salary = salary;        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEssn() {
        return essn;
    }

    public double getSalary() {
        return salary;
    }
    
    public void  raiseSalary(double increased) {
        if (increased <0)
            System.out.println("El valor introducido de be ser mayor que 1.");
        else
            salary += increased;        
    }
    
    public void printEmployee() {
         System.out.println("ID: " +  empId);
        System.out.println("Nombre: " + name);
        System.out.println("Essn: " + essn);
        System.out.println("Salary: " + NumberFormat.getCurrencyInstance().format((double) getSalary()));
    }
}
