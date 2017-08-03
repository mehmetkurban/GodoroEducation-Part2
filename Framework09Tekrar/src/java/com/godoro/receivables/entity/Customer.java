package com.godoro.receivables.entity;

import com.godoro.libray.database.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer extends BaseEntity{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;
    private String customerName;
    private double totalDebit;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalDebit() {
        return totalDebit;
    }

    public void setTotalDebit(double totalDebit) {
        this.totalDebit = totalDebit;
    }
    
    
}
