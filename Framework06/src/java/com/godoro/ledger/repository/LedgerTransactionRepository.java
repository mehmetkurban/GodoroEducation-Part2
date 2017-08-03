
package com.godoro.ledger.repository;

import com.godoro.ledger.entity.LedgerTransaction;
import com.godoro.libray.database.BaseRepository;
import java.util.List;
import javax.persistence.Query;

public class LedgerTransactionRepository extends BaseRepository<LedgerTransaction>{
    
    public LedgerTransactionRepository() {
        super(LedgerTransaction.class);
    }
    
    public List<LedgerTransaction> listByAccountId(long accountId){
        String jpql=createSelectJpql()
                +" where ledgertransaction.account.accountId = :accountId ";
        Query query=entityManager.createQuery(jpql);
        query.setParameter("accountId",accountId);
        return query.getResultList();
    }
    
    public List<LedgerTransaction> listByAccountLocalMinimum(double amountLocalMinimum){
        String jpql=createSelectJpql()
                +" where ledgertransaction.amountLocal >= :amountLocalMinimum ";
        Query query=entityManager.createQuery(jpql);
        query.setParameter("amountLocalMinimum",amountLocalMinimum);
        return query.getResultList();
    }
    
}
