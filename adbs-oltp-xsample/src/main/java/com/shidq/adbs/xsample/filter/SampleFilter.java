package com.shidq.adbs.xsample.filter;

import com.alipay.sofa.rpc.core.exception.SofaRpcException;
import com.alipay.sofa.rpc.core.request.SofaRequest;
import com.alipay.sofa.rpc.core.response.SofaResponse;
import com.alipay.sofa.rpc.ext.Extension;
import com.alipay.sofa.rpc.filter.AutoActive;
import com.alipay.sofa.rpc.filter.Filter;
import com.alipay.sofa.rpc.filter.FilterInvoker;
import org.springframework.stereotype.Service;

@Extension("sampleFilter")
@AutoActive(providerSide = true)
public class SampleFilter extends Filter {
    @Override
    public SofaResponse invoke(FilterInvoker filterInvoker, SofaRequest sofaRequest) throws SofaRpcException {
        System.out.println("sampleFilter run !!!! =====   begin!!!"  );

        System.out.println(filterInvoker) ;
        System.out.println(sofaRequest) ;

        Object[] var2 =   sofaRequest.getMethodArgs() ;


        System.out.println(var2[0].toString()) ;

        SofaResponse sofaResponse = filterInvoker.invoke(sofaRequest)  ;
        System.out.println("sampleFilter run !!!!=====ending");
        return null ;
    }
}
