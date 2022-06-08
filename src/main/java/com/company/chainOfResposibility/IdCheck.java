package com.company.chainOfResposibility;

import java.util.UUID;

public class IdCheck extends AuthenticationProcessor{


    @Override
    public boolean check(UUID id, double balance, double transfer) {
        if(id!=null){
            return checkNext(id, balance, transfer);
        }

        return false;
    }
}
