package com.jh.fcs.userregistration.handler;

import com.jh.fcs.userregistration.api.UserApi;
import com.jh.fcs.userregistration.model.Status;
import com.jh.fcs.userregistration.model.User;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserRegistrationHandler implements UserApi {

    @RequestMapping(value = "/user/register",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    public ResponseEntity<Status> registerUser
            (@ApiParam(value = "" ,required=true )
             @Valid @RequestBody User user) {

        return ResponseEntity.ok(buildStatus());
    }

    private Status buildStatus() {
        Status status = new Status();
        status.setStatus("SUCCESS");
        status.setMessage("Successfully Registered User.");
        return status;
    }

}
