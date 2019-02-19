package cn.gov.wuxi.base.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Author:流氓兔
 * Date:2019/2/18
 **/
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class ConsummerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignClientApplication.class,args);
    }
}
