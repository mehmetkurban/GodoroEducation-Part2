
package com.godoro.human.faces;

import com.godoro.human.entity.Employee;
import com.godoro.human.repository.EmployeeRepository;

import static com.godoro.libray.web.FacesUtilities.getRequestParameter;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class EmployeeDetailBean {
    Employee employee;

    public EmployeeDetailBean() {
        long employeeId=getRequestParameter("employeeId",0);
        employee=new Employee();
    }

    public Employee getEmployee() {
        return employee;
    }
    public void save(){
        EmployeeRepository employeeRepository=new EmployeeRepository();
        employeeRepository.persist(employee);
    
    }
    
}
