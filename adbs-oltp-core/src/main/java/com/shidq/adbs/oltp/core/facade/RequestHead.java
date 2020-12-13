package com.shidq.adbs.oltp.core.facade;

/**
 * @Author : shidq
 * @Time : 2020/12/12 : 22:10
 * @Version : 1.0.0
 * @Desciption : 公共请求报文头
 **/
public class RequestHead {

    /* 标准服务名 */
    String stdServiceName ;

    /* 标准服务方法 */
    String stdServiceMethod ;

    /* 标准服务版本号 */
    String stdServiceVersion ;

    /*交易性质 0-正常 1-补偿 2-冲正 3-重复 */
    String txType ;

    /*交易日期 (系统会计日期) */
    String txDate ;

    /*全局流水号*/
    String globalSequence ;

    /*全局子流水号*/
    String globalSubSequence ;

    /*消费者名称*/
    String consumerName ;

    /*消费者系统日期*/
    String consumerDate ;

    /*消费者流水号*/
    String consumerSequence ;

    /*消费者服务代码*/
    String consumerServiceId ;

    /*交易渠道代码*/
    String channelNo ;

    /*交易机构*/
    String branchNo ;

    /*交易柜员*/
    String TellerNo ;

    /*mac*/
    String macId ;

}
