package com.shidq.adbs.xsample.impl;

import com.shidq.adbs.oltp.core.filter.CustomFilter;
import com.shidq.adbs.xsample.facade.HelloSyncService;
import com.shidq.adbs.xsample.utils.SpringUtils;

public class    HelloSyncServiceImpl implements HelloSyncService {

    int a  ;
    @Override
    public String saySync(String string) {
        a += 1 ;
        System.out.println("a = =  " +a ) ;
        System.out.println("hello!!! excuted HelloSyncServiceImpl ");

        CustomFilter customFilter = SpringUtils.getBean("customFilter") ;

        System.out.println("hello!!! "+ customFilter);
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
