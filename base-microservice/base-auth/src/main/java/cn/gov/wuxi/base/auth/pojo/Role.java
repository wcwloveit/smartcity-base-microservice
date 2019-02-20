package cn.gov.wuxi.base.auth.pojo;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

/**
 * Author:流氓兔
 * Date:2019/2/19
 **/

@Data
public class Role implements GrantedAuthority {

    private Long id;

    private String name;

    @Override
    public String getAuthority() {
        return name;
    }
}
