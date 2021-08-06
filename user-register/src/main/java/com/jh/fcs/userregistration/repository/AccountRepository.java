package com.jh.fcs.userregistration.repository;

import com.jh.fcs.userregistration.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}