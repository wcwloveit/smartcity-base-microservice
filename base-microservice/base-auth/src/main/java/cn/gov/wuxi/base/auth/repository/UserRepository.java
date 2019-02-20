package cn.gov.wuxi.base.auth.repository;
import cn.gov.wuxi.base.auth.pojo.User;
import cn.gov.wuxi.base.auth.provider.UserSqlProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

/**
 * Author:流氓兔
 * Date:2019/2/19
 **/
@Mapper
public interface UserRepository {

    @SelectProvider(type=UserSqlProvider.class,method="findByUsername")
    User findByUsername(String username);

}
