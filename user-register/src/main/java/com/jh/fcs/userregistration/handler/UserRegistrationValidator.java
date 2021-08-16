package com.jh.fcs.userregistration.handler;

import com.jh.fcs.userregistration.model.User;
import org.springframework.stereotype.Component;

import static org.springframework.util.ObjectUtils.isEmpty;

@Component
public class UserRegistrationValidator {

    public boolean isValid(User user) {
        if(isEmpty(user.getFirstName())) {
            return false;
        }
        if(isEmpty(user.getLastName())) {
            return false;
        }
        if(isEmpty(user.getUsername())) {
            return false;
        }
        if(isEmpty(user.getPassword())) {
            return false;
        }
        if(isEmpty(user.getAddress1())) {
            return false;
        }
        if(isEmpty(user.getCity())) {
            return false;
        }
        if(isEmpty(user.getZip())) {
            return false;
        }
        if(isEmpty(user.getState())) {
            return false;
        }
        if(isEmpty(user.getType())) {
            return false;
        }
        if(isEmpty(user.getEmail()) && isEmpty(user.getPhone())) {
            return false;
        }

        return true;
    }
}
