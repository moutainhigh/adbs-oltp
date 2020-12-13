package com.shidq.adbs.xsample.impl;

import com.shidq.adbs.xsample.facade.HelloSyncService;
import com.shidq.adbs.xsample.response.HelloSyncServiceResp;

import java.util.HashMap;
import java.util.Map;

public class    HelloSyncServiceImpl implements HelloSyncService {

    int a  ;
    @Override
    public Map<String, Object> saySync(String string) {
        a += 1 ;
        System.out.println("a = =  " +a ) ;
        System.out.println("hello!!! excuted HelloSyncServiceImpl ");
        Map resp = new HashMap() ;
        resp.put("age",16) ;
        resp.put("name","jack") ;
        resp.put("sex","male") ;

        return resp;

    }

    @Override
    public String saySync0(String string) {
        a += 1 ;
        System.out.println("a = =  " +a ) ;
        System.out.println("hello0!!! excuted HelloSyncServiceImpl ");
        return "provider1 tell you : this is your say: " +  string;
    }
}
