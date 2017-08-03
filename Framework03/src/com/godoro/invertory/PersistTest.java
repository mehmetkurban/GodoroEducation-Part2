
package com.godoro.invertory;

import com.godoro.human.entity.Department;
import com.godoro.human.entity.Employee;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistTest {
    public static void main(String[] args) {
        Department departmentA=new Department(0,"Muhasebe");
        departmentA.setEmployeeList(new ArrayList<Employee>());
        
        Employee employee1=new Employee(0, "Sibel Can", 3400);
        employee1.setDepartment(departmentA);
        departmentA.getEmployeeList().add(employee1);
        
        Employee employee2=new Employee(1, "Ebru Gündeş", 1300);
        employee2.setDepartment(departmentA);
        departmentA.getEmployeeList().add(employee2);
        
        Employee employee3=new Employee(2, "Gülben Ergen", 2400);
        employee3.setDepartment(departmentA);
        departmentA.getEmployeeList().add(employee3);
        
         EntityManagerFactory factory=Persistence
                .createEntityManagerFactory("Framework03PU");
         EntityManager entityManager=factory.createEntityManager();
         
         entityManager.getTransaction().begin();
         entityManager.persist(departmentA);
         entityManager.getTransaction().commit();
         
         entityManager.close();
         
         System.out.println("Eklendi"+departmentA.getDepartmentId());
        
    }
}
