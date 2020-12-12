package com.shidq.adbs.oltp.core.exception;

import java.util.concurrent.ConcurrentHashMap;
/**
  @Author     : shidq
  @Time       : 2020-12-12 12:50
  @version    : 1.0.0
  @Description:
**/
public class AdbsExceptionHoler {



   public static ConcurrentHashMap<String,String> adbsExceptionMap  = new ConcurrentHashMap <String,String>(500);

   public static String getExceptionByCode(String bizMsgCode){
       return adbsExceptionMap.get(bizMsgCode) ;
   }

   public static String getExceptionByFactors(String bizMsgCode,String ...factors){
      String Msg = adbsExceptionMap.get(bizMsgCode) ;
      for (int i= 0 ;i<factors.length;i++){
         if (i==5) break ;
         String matchFactor = "&@".replace('@',(char)(i+1+48)) ;
         Msg.replace(matchFactor,factors[i]) ;
      };
      return Msg ;
   }

   public void loadMessage() {

   }

   private void putMsg(String bizMsgCode,String message){
      adbsExceptionMap.put(bizMsgCode,message) ;
   }



}
