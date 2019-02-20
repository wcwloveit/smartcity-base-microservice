package cn.gov.wuxi.base.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;

/**
 * Author:流氓兔
 * Date:2019/2/19
 **/
@RestController
@RequestMapping("/users")
public class RemoteTokenController {

    @RequestMapping(value = "/current",method = RequestMethod.GET)
    public Principal getUser(Principal principal){
        return principal;
    }

}
