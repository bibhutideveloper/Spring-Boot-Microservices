package com.bibhuti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bibhuti.entity.Account;
import com.bibhuti.entity.AccountPK;

public interface AccountRepo extends JpaRepository<Account, AccountPK> {

}
