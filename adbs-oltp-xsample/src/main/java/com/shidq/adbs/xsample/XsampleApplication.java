package com.shidq.adbs.xsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author : shidq
 * @Date : 2020/11/20 0:59
 * @Desc : springboot启动程序
 * @Version : 1.0
 */
@ImportResource({ "classpath*:rpc-sofa-boot-starter-samples.xml" })
@SpringBootApplication(scanBasePackages = "com.shidq.adbs.*")
public class XsampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(XsampleApplication.class, args);
    }

}
