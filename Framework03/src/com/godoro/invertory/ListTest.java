package com.godoro.invertory;

import com.godoro.human.entity.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ListTest {
    public static void main(String[] args) {
        long departmentId=1;
    
        EntityManagerFactory factory=Persistence
                .createEntityManagerFactory("Framework03PU");
        EntityManager entityManager=factory.createEntityManager();
        String jpql="select employee from Employee as employee "
                +" where employee.department.departmentId = :departmentId";
        Query query=entityManager.createQuery(jpql);
        query.setParameter("departmentId", departmentId);
        List <Employee> employeeList=query.getResultList();
        for(Employee employee:employeeList){
            System.out.println("\t"+employee.getEmployeeId()+""
                    +employee.getEmloyeeName()+""
                    +employee.getMonthlySalary()+""
            +employee.getDepartment().getDepartmentId()
            +employee.getDepartment().getDepartmentName());
        }
        entityManager.close();
    }
}
