

package com.godoro.trade.repository;

import com.godoro.trade.entity.Customer;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CustomerSummaryBean {
    
    private List<Customer> customerList;

    public CustomerSummaryBean() {
        CustomerRepository customerRepository = new CustomerRepository();
        customerList = customerRepository.list();
        customerRepository.close();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
    
    

    
}
