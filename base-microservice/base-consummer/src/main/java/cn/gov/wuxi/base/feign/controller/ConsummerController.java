package cn.gov.wuxi.base.feign.controller;

import cn.gov.wuxi.base.feign.service.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:流氓兔
 * Date:2019/2/18
 **/

@RestController
public class ConsummerController {

    @Autowired
    private FeignClientService consummerService;

    @GetMapping(value = "test")
    public String invoke(){
        System.out.println("=======================================");
        return consummerService.test();
    }

}
