package com.godoro.receiable.repository;

import com.godoro.libray.database.BaseRepository;
import com.godoro.receivables.entity.Customer;


public class CustomerRepository extends BaseRepository<Customer>{
    
    public CustomerRepository() {
        super(Customer.class);
    }
    
}
