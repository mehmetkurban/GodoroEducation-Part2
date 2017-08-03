
package com.godoro.ledger.faces;

import com.godoro.ledger.entity.LedgerAccount;
import com.godoro.ledger.repository.LedgerAccountRepository;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class LedgerApplicationBean {
    
    public List<LedgerAccount> getAccountList(){
        LedgerAccountRepository accountRepository=new LedgerAccountRepository();
        List<LedgerAccount> accountList=accountRepository.list();
        accountRepository.close();
        return accountList;
    }
}
