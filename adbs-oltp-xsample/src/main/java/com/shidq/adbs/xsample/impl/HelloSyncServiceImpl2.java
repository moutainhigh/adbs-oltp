package com.shidq.adbs.xsample.impl;

import com.shidq.adbs.xsample.facade.HelloSyncService2;

import java.util.HashMap;

public class HelloSyncServiceImpl2 implements HelloSyncService2 {
    @Override
    public HashMap<String,String> saySync(HashMap<String,String> content) {

        HashMap<String,String> out = new HashMap<String,String>() ;
        out.put("key1" ,"key1 :"+content.get("key1")) ;

        return  out ;
    }
}
