package com.shidq.adbs.oltp.core.exception;

/**
  @Author     : shidq
  @Time       : 2020-12-12 12:52
  @version    : 1.0.0
  @Description:
**/
public class AdbsException extends RuntimeException {
    public String bizMsgCode ;
    public String bizMsg ;
    public int msgLevel ;

    public AdbsException(String bizMsgCode){
        super(AdbsExceptionHoler.getExceptionByCode(bizMsgCode)) ;
        this.bizMsgCode = bizMsgCode ;
        this.bizMsg = super.getMessage() ;
    }

    public AdbsException(String bizMsgCode,String ...factors) {
        super(AdbsExceptionHoler.getExceptionByFactors(bizMsgCode,factors)) ;
        this.bizMsgCode = bizMsgCode ;
        this.bizMsg = super.getMessage() ;
    }

}
