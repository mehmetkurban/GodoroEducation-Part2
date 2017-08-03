
package com.godoro.ledger.entity;

import com.godoro.libray.database.BaseEntity;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class LedgerAccount extends BaseEntity{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountId;
    private String accountName;
   
    @OneToMany(mappedBy = "account",cascade = CascadeType.ALL)
    private List<LedgerTransaction> transactionsList; 

    public List<LedgerTransaction> getTransactionsList() {
        return transactionsList;
    }

    public void setTransactionsList(List<LedgerTransaction> transactionsList) {
        this.transactionsList = transactionsList;
    }
    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

 
    
}
