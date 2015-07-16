/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.employee;

import com.example.domain.Employee;

/**
 * 
 * @author 
 */
public class EmployeeTest {
    
    public static void main(String[] args) {
        
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("Jane Smith");
        emp.setEssn("012-34-5678");
        emp.setSalary(120_345.27);
        
        System.out.println("ID: " + emp.getId());
        System.out.println("Nombre: " + emp.getName());
        System.out.println("Sessn: " + emp.getEssn());
        System.out.println("Salary: " + emp.getSalary());
        
    }

}
