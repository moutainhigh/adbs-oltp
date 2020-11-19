package com.shidq.adbs.xsample.impl;

import com.shidq.adbs.xsample.facade.HelloSyncService3;

public class HelloSyncServiceImpl3 implements HelloSyncService3 {
    @Override
    public String saySync(String string) {
        return "provider3 tell you : this is your say: " +  string;
    }
}
