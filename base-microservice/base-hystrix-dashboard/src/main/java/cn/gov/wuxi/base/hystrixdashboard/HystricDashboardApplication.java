package cn.gov.wuxi.base.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@EnableHystrixDashboard
@EnableHystrix
public class HystricDashboardApplication {
    @GetMapping("/")
    public String home() {
        return "forward:/hystrixdashboard";
    }

    public static void main(String[] args) {
        SpringApplication.run(HystricDashboardApplication.class, args);
    }
}
