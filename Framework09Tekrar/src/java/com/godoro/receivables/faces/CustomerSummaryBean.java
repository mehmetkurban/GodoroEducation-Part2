
package com.godoro.receivables.faces;

import com.godoro.libray.web.FacesUtilities;
import com.godoro.receiable.repository.CustomerRepository;
import com.godoro.receivables.entity.Customer;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean
@RequestScoped
public class CustomerSummaryBean {
    private List<Customer> customerList;

    public CustomerSummaryBean() {
        CustomerRepository customerRepository=new CustomerRepository();
        customerList=customerRepository.list();
        customerRepository.close();
    }
    public List<Customer> getCustomerList(){
        return customerList;
    }
    
    public void remove(){
         long customerId=FacesUtilities.getRequestParameter("customerId", 0);
         CustomerRepository customerRepository=new CustomerRepository();
         customerRepository.remove(customerId);
         customerList=customerRepository.list();
         customerRepository.close();        
    }
}
