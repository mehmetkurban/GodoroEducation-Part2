
package com.godoro.ledger.faces;



import com.godoro.ledger.entity.LedgerAccount;
import com.godoro.ledger.entity.LedgerTransaction;
import com.godoro.ledger.repository.LedgerAccountRepository;

import com.godoro.ledger.repository.LedgerTransactionRepository;
import static com.godoro.libray.web.FacesUtilities.getRequestParameter;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



@ManagedBean
@RequestScoped
public class LedgerTransactionDetailBean {
    private LedgerTransaction transaction;
    private long selectAccountId;

    public long getSelectAccountId() {
        return selectAccountId;
    }

    public void setSelectAccountId(long selectAccountId) {
        this.selectAccountId = selectAccountId;
    }
    

    public LedgerTransaction getTransaction() {
        return transaction;
    }

    

    public LedgerTransactionDetailBean() {
        long transactionId=getRequestParameter("transactionId",0);
        if(transactionId==0){
            transaction=new  LedgerTransaction();
            transaction.setTransactionName("");
            transaction.setAmountLocal(0);
        }else{
            LedgerTransactionRepository transactionRepository=new LedgerTransactionRepository();
            transaction=transactionRepository.find(transactionId);
            transactionRepository.close();
            selectAccountId=transaction.getAccount().getAccountId();
        }    
    }
    
    private void setAccount(){
        if(selectAccountId!=0){
            LedgerAccountRepository accountRepository=new LedgerAccountRepository();
            LedgerAccount account=accountRepository.find(selectAccountId);
            accountRepository.close();
            transaction.setAccount(account);
            
        }
    }
    
    public void save(){
        setAccount();
        long tranactionId=getRequestParameter("transactionId",0);
     
        LedgerTransactionRepository transactionRepository=new LedgerTransactionRepository();
        if(tranactionId==0){
            transactionRepository.persist(transaction);
        }else{
            transactionRepository.merge(transaction);
        }
            transactionRepository.close();
    
    }
    
}
