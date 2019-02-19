package cn.gov.wuxi.base.feign.service;

import cn.gov.wuxi.base.feign.hystrix.HystrixFeignFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author:流氓兔
 * Date:2019/2/18
 **/
@FeignClient(name = "service-provider",fallback = HystrixFeignFallback.class)
public interface FeignClientService {

    @GetMapping(value = "provider")
    String test();

}
