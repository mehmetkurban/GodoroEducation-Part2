
package com.godoro.human.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    private String emloyeeName;
    private double monthlySalary;
    @ManyToOne @JoinColumn(name="departmentId")
    private Department department;

    public Employee() {
    }

    public Employee(int employeeId, String emloyeeName, double monthlySalary) {
        this.employeeId = employeeId;
        this.emloyeeName = emloyeeName;
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

   

    public String getEmloyeeName() {
        return emloyeeName;
    }

    public void setEmloyeeName(String emloyeeName) {
        this.emloyeeName = emloyeeName;
    }



    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
}
