/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example;

import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Manager;

/**
 * 
 * @author 
 */
public class EmployeeTest {
    
    public static void main(String[] args) {
        
        Employee emp = new Employee (101,"Jane Smith", "012-34-5678",120_345.27);
        Manager emp2 = new Manager (207,"Barbara Johnson","054-12-2367",109_501.36,"US Marketing");
        Admin emp3 = new Admin (304, "Bill Munroe","108-23-6509",75_002.34);
        Director emp4 = new Director (12, "Susan Wheeler", "099-45-2340",120_567.36,"Global Marketing", 1_000_000.00);
        
         System.out.println("*********************");
        System.out.println( emp.toString());
         System.out.println("--------------------------");
        System.out.println( emp2.toString());
         System.out.println("--------------------------");
         System.out.println( emp3.toString());
         System.out.println("--------------------------");
         System.out.println( emp4.toString());
         System.out.println("*********************");
    }

}
