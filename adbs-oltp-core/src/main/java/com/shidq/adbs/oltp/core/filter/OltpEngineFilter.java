package com.shidq.adbs.oltp.core.filter;

import com.alipay.sofa.rpc.core.exception.SofaRpcException;
import com.alipay.sofa.rpc.core.request.SofaRequest;
import com.alipay.sofa.rpc.core.response.SofaResponse;
import com.alipay.sofa.rpc.ext.Extension;
import com.alipay.sofa.rpc.filter.AutoActive;
import com.alipay.sofa.rpc.filter.Filter;
import com.alipay.sofa.rpc.filter.FilterInvoker;
import com.shidq.adbs.oltp.core.context.ServiceContextBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

/**
 * @Author : shidq
 * @Date : 2020/11/20 1:11
 * @Desc : sofa过滤器，ADBS交易引擎
 * @Version : 1.0
 */
@Extension("oltpEngineFilter")
@AutoActive(providerSide = true)
public class OltpEngineFilter extends Filter {

    @Autowired
    OltpEngineHandler oltpEngineHandler ;

    @Autowired
    ServiceContextBuilder serviceContextBuilder ;

    @Override
    public SofaResponse invoke(FilterInvoker filterInvoker, SofaRequest sofaRequest) throws SofaRpcException {
        System.out.println("OltpEngineFilter run !!!! =====   begin!!!"  );

        System.out.println(filterInvoker) ;
        System.out.println(sofaRequest) ;

        Object[] var2 =   sofaRequest.getMethodArgs() ;


        System.out.println(var2[0].toString()) ;

        SofaResponse sofaResponse = filterInvoker.invoke(sofaRequest)  ;
        System.out.println("OltpEngineFilter run !!!!=====ending");
//        HashMap respmap = new HashMap() ;
//        respmap.put("k1","V1") ;
//        respmap.put("k2","V2") ;
//        respmap.put("k3","V3") ;
//        respmap.put("k4","V4") ;
//        sofaResponse.setAppResponse(respmap);
        return sofaResponse ;
    }
}
