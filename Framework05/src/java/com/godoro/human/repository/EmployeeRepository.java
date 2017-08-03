
package com.godoro.human.repository;

import com.godoro.human.entity.Employee;

import com.godoro.libray.database.BaseRepository;


public class EmployeeRepository extends BaseRepository<Employee>{

    public EmployeeRepository() {
        super(Employee.class);
    }
    
    
    
}
