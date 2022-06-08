package com.company.chainOfResposibility;

import java.util.UUID;

public class BalanceCheck extends AuthenticationProcessor{

    @Override
    public boolean check(UUID id, double balance, double transfer) {
        if(balance < transfer){
            return false;
        }
        return checkNext(id,balance,transfer);
    }
}
