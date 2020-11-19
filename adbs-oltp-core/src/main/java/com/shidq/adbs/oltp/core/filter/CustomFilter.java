package com.shidq.adbs.oltp.core.filter;

import com.alipay.sofa.rpc.core.exception.SofaRpcException;
import com.alipay.sofa.rpc.core.request.SofaRequest;
import com.alipay.sofa.rpc.core.response.SofaResponse;
import com.alipay.sofa.rpc.ext.Extension;
import com.alipay.sofa.rpc.filter.AutoActive;
import com.alipay.sofa.rpc.filter.Filter;
import com.alipay.sofa.rpc.filter.FilterInvoker;

/**
 * @Author : shidq
 * @Date : 2020/11/20 1:11
 * @Desc :
 * @Version : 1.0
 */
@Extension("customer")
@AutoActive(providerSide = true, consumerSide = true)
public class CustomFilter extends Filter {
    @Override
    public SofaResponse invoke(FilterInvoker filterInvoker, SofaRequest sofaRequest) throws SofaRpcException {
        System.out.println("CustomFilter run !!!! =====   begin!!!"  );

        System.out.println(filterInvoker) ;
        System.out.println(sofaRequest) ;

        Object[] var2 =   sofaRequest.getMethodArgs() ;


        System.out.println(var2[0].toString()) ;

        SofaResponse sofaResponse = filterInvoker.invoke(sofaRequest)  ;
        System.out.println("CustomFilter run !!!!=====ending");
        return sofaResponse ;
    }
}
