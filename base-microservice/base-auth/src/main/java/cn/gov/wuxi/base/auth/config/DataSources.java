package cn.gov.wuxi.base.auth.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

/**
 * Author:流氓兔
 * Date:2019/2/19
 **/
@Configuration
public class DataSources {

    @Bean
    public DataSource dataSource(){
        return new DruidDataSource();
    }
}
