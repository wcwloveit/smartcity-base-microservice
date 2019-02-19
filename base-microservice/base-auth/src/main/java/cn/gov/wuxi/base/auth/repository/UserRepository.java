package cn.gov.wuxi.base.auth.repository;

import cn.gov.wuxi.base.auth.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Author:流氓兔
 * Date:2019/2/19
 **/
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
