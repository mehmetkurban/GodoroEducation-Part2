
package com.godoro.invertory;

import com.godoro.human.entity.Department;
import com.godoro.human.entity.Employee;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindTest {
    public static void main(String[] args) {
        long departmanId=2;
    
    EntityManagerFactory factory=Persistence
                .createEntityManagerFactory("Framework03PU");
    EntityManager entityManager=factory.createEntityManager();
    
        Department department=entityManager.find(Department.class, departmanId);
        
    entityManager.close();
    for(Employee employee:department.getEmployeeList()){
            System.out.println("\t"+employee.getEmployeeId()+""
                    +employee.getEmloyeeName()+""
                    +employee.getMonthlySalary());
        }
        
    }
}
