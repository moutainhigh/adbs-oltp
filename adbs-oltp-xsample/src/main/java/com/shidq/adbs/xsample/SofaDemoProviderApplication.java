package com.shidq.adbs.xsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author : shidq
 * @Date : 2020/11/20 0:59
 * @Desc :
 * @Version : 1.0
 */
@ImportResource({ "classpath*:rpc-sofa-boot-starter-samples.xml" })
@SpringBootApplication(scanBasePackages = "com.shidq.adbs.*")
public class SofaDemoProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SofaDemoProviderApplication.class, args);
    }

}
