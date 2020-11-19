package com.shidq.adbs.xsample.impl;

import com.shidq.adbs.xsample.facade.HelloSyncService;

public class HelloSyncServiceImpl implements HelloSyncService {

    int a  ;
    @Override
    public String saySync(String string) {
        a += 1 ;
        System.out.println("a = =  " +a ) ;
        System.out.println("hello!!! excuted HelloSyncServiceImpl ");
        return "provider tell you : this is your say: " +  string;

    }

    @Override
    public String saySync0(String string) {
        a += 1 ;
        System.out.println("a = =  " +a ) ;
        System.out.println("hello0!!! excuted HelloSyncServiceImpl ");
        return "provider1 tell you : this is your say: " +  string;
    }
}
