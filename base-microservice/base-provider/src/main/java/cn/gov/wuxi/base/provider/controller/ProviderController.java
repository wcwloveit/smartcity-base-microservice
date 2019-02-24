package cn.gov.wuxi.base.provider.controller;

import cn.gov.wuxi.base.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:流氓兔
 * Date:2019/2/18
 **/
@RestController
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @GetMapping(value = "provider")
    public String test(){
        System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
       return providerService.test();
    }
}
