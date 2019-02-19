package cn.gov.wuxi.base.auth.pojo;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

/**
 * Author:流氓兔
 * Date:2019/2/19
 **/
@Entity
@Data
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;

    @Override
    public String getAuthority() {
        return name;
    }
}
