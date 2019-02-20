package cn.gov.wuxi.base.auth.provider;

/**
 * Author:流氓兔
 * Date:2019/2/20
 **/
public class UserSqlProvider {

    public String findByUsername() {
        return "select * from merchantdb where username = #{username}";
    }
}
