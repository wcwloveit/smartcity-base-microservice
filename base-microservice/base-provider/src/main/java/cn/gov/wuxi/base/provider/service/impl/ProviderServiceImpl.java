package cn.gov.wuxi.base.provider.service.impl;

import cn.gov.wuxi.base.provider.service.ProviderService;
import org.springframework.stereotype.Service;

/**
 * Author:流氓兔
 * Date:2019/2/18
 **/
@Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String test() {
        return "你好！朋友！哈哈";
    }
}
