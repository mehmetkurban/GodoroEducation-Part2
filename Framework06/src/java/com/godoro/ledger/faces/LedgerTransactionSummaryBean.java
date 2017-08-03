
package com.godoro.ledger.faces;

import com.godoro.ledger.entity.LedgerTransaction;
import com.godoro.ledger.repository.LedgerTransactionRepository;
import com.godoro.libray.web.FacesUtilities;
import com.sun.xml.wss.SubjectAccessor;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class LedgerTransactionSummaryBean {
    private List<LedgerTransaction> transactionList;
    private long selectedAccountId;
    
    public LedgerTransactionSummaryBean() {
            selectedAccountId=FacesUtilities.getRequestParameter("accountId", 0);
            selectTransactionList();
    }
    public void filter(){
     selectTransactionList();
    }
    
    private void selectTransactionList(){
        LedgerTransactionRepository legerTransactionRepository=new LedgerTransactionRepository();
        if(selectedAccountId==0){
            transactionList=legerTransactionRepository.list();
        }else{
            transactionList=legerTransactionRepository.listByAccountId(selectedAccountId);
        }
        legerTransactionRepository.close();
    }
    
    
    
    
    public long getSelectedAccountId() {
        return selectedAccountId;
    }

    public void setSelectedAccountId(long selectedAccountId) {
        this.selectedAccountId = selectedAccountId;
    }
    
        
    public List<LedgerTransaction> getTransactions(){
    return transactionList;
    }
}
