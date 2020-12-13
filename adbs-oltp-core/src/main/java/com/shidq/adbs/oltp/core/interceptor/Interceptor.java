package com.shidq.adbs.oltp.core.interceptor;

/**
 * @Author : shidq
 * @Time : 2020/12/13 : 11:22
 * @Desciption : 拦截器接口
 **/
public interface Interceptor {
    /*前置处理*/
    public void onRequest() ;

    /*后置处理*/
    public void onResponse() ;
}
