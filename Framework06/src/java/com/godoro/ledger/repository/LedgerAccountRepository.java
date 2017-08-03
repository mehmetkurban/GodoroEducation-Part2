
package com.godoro.ledger.repository;

import com.godoro.ledger.entity.LedgerAccount;

import com.godoro.libray.database.BaseRepository;


public class LedgerAccountRepository extends BaseRepository<LedgerAccount>{
    
    public LedgerAccountRepository() {
        super(LedgerAccount.class);
    }
    
    
}
