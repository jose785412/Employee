/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example;

import com.example.business.EmployeeStockPlan;
import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Manager;

/**
 * 
 * @author 
 */
public class EmployeeTest {
    
    public static void main(String[] args) {
        
        Engineer eng = new Engineer (101,"Jane Smith", "012-34-5678",120_345.27);
        Manager mgr = new Manager (207,"Barbara Johnson","054-12-2367",109_501.36,"US Marketing");
        Admin adm = new Admin (304, "Bill Munroe","108-23-6509",75_002.34);
        Director dir = new Director (12, "Susan Wheeler", "099-45-2340",120_567.36,"Global Marketing", 1_000_000.00);
        
        EmployeeStockPlan esp = new EmployeeStockPlan();
        
        printEmployee(eng, esp);
        printEmployee(mgr, esp);
        printEmployee(adm, esp);
        printEmployee(dir, esp);
        
        // Probleamas de Casteo Módulo 4.2
        
        Employee emp = new Employee(13, "Lionel Power", "099-90-6789",67_990.90);
        Employee obj = new Engineer(102,"Robert Stock", "013-78-5678", 220_345.27);
        
        //eng.engineerMethod();
        
        printEmployee(obj);
        
        Engineer engobj = new Engineer  (1, "Brenda Wills", "013-78-5678", 221_500.00);
        
        printEmployee(engobj);
        
       // String s = (String) emp;
        
    }

    static void printEmployee (Employee emp) {
        System.out.println("\nEmployee type:      " + emp.getClass().getSimpleName());
        System.out.println (emp);
    }
    
    static void printEmployee (Employee emp, EmployeeStockPlan esp) {
        
        printEmployee(emp);
        System.out.println("Stock Options:      " + esp.grantStock(emp));
    }
}
