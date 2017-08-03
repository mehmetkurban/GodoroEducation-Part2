
package com.godoro.receivables.faces;

import com.godoro.libray.web.FacesUtilities;
import com.godoro.receiable.repository.CustomerRepository;
import com.godoro.receivables.entity.Customer;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.RequestScoped;
@ManagedBean
@RequestScoped
public class CustomerDetailBean {
    private Customer customer;

    public CustomerDetailBean() {
        long customerId=FacesUtilities.getRequestParameter("customerId", 0);
        if(customerId==0){
            customer=new Customer();
            customer.setCustomerName("Adsız");
            customer.setTotalDebit(0);
        }else{
            CustomerRepository customerRepository=new CustomerRepository();
            customer=customerRepository.find(customerId);
            customerRepository.close();
        }
        
    }

    
    public Customer getCustomer() {
        return customer;
    }
    
    public void save(){
        long customerId=FacesUtilities.getRequestParameter("customerId", 0);
        CustomerRepository customerRepository=new CustomerRepository();
        if(customerId==0){
              customerRepository.persist(customer);
        }else{
              customerRepository.merge(customer);
        }
        customerRepository.close();
    }
}
