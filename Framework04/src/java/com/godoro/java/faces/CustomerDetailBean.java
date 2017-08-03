

package com.godoro.java.faces;

import com.godoro.trade.entity.Customer;
import com.godoro.trade.repository.CustomerRepository;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
@RequestScoped
public class CustomerDetailBean {
    
    private Customer customer;

    public CustomerDetailBean() {
        long customerId = 0;
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        customerId = (request.getParameter("customerId") != null) ? Long.parseLong(request.getParameter("customerId")) : 0;
     
        if (customerId == 0) {
            customer = new Customer();
        } else {
            CustomerRepository customerRepository = new CustomerRepository();
            customer = customerRepository.find(customerId);
            customerRepository.close();
        }

    }
    
    

    public Customer getCustomer() {
        return customer;
    }
    
    public String save() {
       CustomerRepository customerRepository = new CustomerRepository();
        
       long customerId = 0;
       HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
       customerId = (request.getParameter("customerId") != null) ? Long.parseLong(request.getParameter("customerId")) : 0;
     
        if (customerId == 0) {
            customerRepository.persist(customer);
        } else {
            customerRepository.merge(customer);
            
        }
        return "customerSummary.xhtml";
        
        
    }
    
    

}
