package com.jh.fcs.userregistration.helper;

import com.jh.fcs.userregistration.model.Account;
import com.jh.fcs.userregistration.model.User;
import com.jh.fcs.userregistration.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class UserRegistrationHelper {

    @Autowired
    private AccountRepository accountRepository;

    @Transactional
    public void registerUser(User user){
        Account account = buildAccount(user);
        accountRepository.save(account);
    }

    private Account buildAccount(User user) {
        Account account = new Account();
        account.setFirstName(user.getFirstName());
        account.setLastName(user.getLastName());
        account.setType(user.getType());
        account.setAddress1(user.getAddress1());
        account.setAddress2(user.getAddress2());
        account.setCity(user.getCity());
        account.setStateCd(user.getState());
        account.setZip(user.getZip());
        account.setEmail(user.getEmail());
        account.setPhoneNo(user.getPhone());
        return account;
    }
}
