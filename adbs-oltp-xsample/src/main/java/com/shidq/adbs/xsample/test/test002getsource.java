package com.shidq.adbs.xsample.test;

import java.io.IOException;
import java.util.Enumeration;

/**
 * @Author : shidq
 * @Time : 2020/12/12 : 23:21
 * @Version : 1.0.0
 * @Desciption :
 **/
public class test002getsource {

    public static void main(String[] args) throws ClassNotFoundException, IOException {


        Class cl = Class.forName("com.shidq.adbs.xsample.test.test002getsource") ;

        ClassLoader loader = cl.getClassLoader();

        Enumeration en = loader.getSystemResources("META-INF/services/sofa-rpc/com.alipay.sofa.rpc.filter.Filter");

        // Display address of the resource
        System.out.print("Enum of System Resources : ");

        while (en.hasMoreElements())
            System.out.println(en.nextElement());;




    }
}
