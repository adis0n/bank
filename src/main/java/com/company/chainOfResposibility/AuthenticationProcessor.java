package com.company.chainOfResposibility;

import com.company.Account;

import java.util.UUID;

public abstract class AuthenticationProcessor {
    private AuthenticationProcessor nextProcessor;


    public AuthenticationProcessor linkWith(AuthenticationProcessor nextProcessor){
        this.nextProcessor = nextProcessor;
        return nextProcessor;
    }

    public abstract boolean check(UUID id, double balance, double transfer);

    protected boolean checkNext(UUID id, double balance, double transfer){
        if(nextProcessor ==  null){
            return true;
        }
        return nextProcessor.check(id,balance, transfer);
    }


}
