
package com.godoro.ledger.entity;

import com.godoro.libray.database.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LedgerTransaction extends BaseEntity{
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long transactionId;
   private String transactionName;
   private double amountLocal;

    public double getAmountLocal() {
        return amountLocal;
    }

    public void setAmountLocal(double amountLocal) {
        this.amountLocal = amountLocal;
    }
    @ManyToOne @JoinColumn(name="accountId")
   private LedgerAccount account;

    public LedgerAccount getAccount() {
        return account;
    }

    public void setAccount(LedgerAccount account) {
        this.account = account;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }
   
}
