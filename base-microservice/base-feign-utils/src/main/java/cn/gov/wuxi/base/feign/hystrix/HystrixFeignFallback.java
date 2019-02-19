package cn.gov.wuxi.base.feign.hystrix;

import cn.gov.wuxi.base.feign.service.FeignClientService;
import org.springframework.stereotype.Component;

/**
 * Author:流氓兔
 * Date:2019/2/18
 **/
@Component
public class HystrixFeignFallback implements FeignClientService {
    @Override
    public String test() {
        return "出错了！！！";
    }
}
