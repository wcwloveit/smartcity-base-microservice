package cn.gov.wuxi.base.auth;

import cn.gov.wuxi.base.auth.service.UserServiceDetail;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;


@SpringBootApplication
@EnableEurekaClient
@EnableResourceServer
@MapperScan({"cn.gov.wuxi.base.auth.reposity"})//开启mapper文件扫描
public class AuthServerApplication {

	@Autowired
	@Qualifier("dataSource")
	private DataSource dataSource;

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) throws Exception {
		new SpringApplicationBuilder(AuthServerApplication.class).web(true).run(args);
	}
	@Configuration
	@EnableAuthorizationServer
	protected class OAuth2AuthorizationConfig extends AuthorizationServerConfigurerAdapter{
		// The following pattern shows the Token will be stored in the memory
		//private TokenStore tokenStore = new InMemoryTokenStore();
		//The following pattern shows the Token will be stored in the DB
		JdbcTokenStore tokenStore = new JdbcTokenStore(dataSource);
		@Autowired
		@Qualifier("authenticationManagerBean")
		private AuthenticationManager authenticationManager;
		@Autowired
		private UserServiceDetail userServiceDetail;

		@Override
		public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {

			security
					.tokenKeyAccess("permitAll()")
					.checkTokenAccess("isAuthenticated()");

		}

		@Override
		public void configure(ClientDetailsServiceConfigurer clients) throws Exception {

			clients.inMemory()
					.withClient("browser")
					.authorizedGrantTypes("refresh_token","password")
					.scopes("ui")
					.and()
					.withClient("service-hi")
					.secret("123456")
					.authorizedGrantTypes("client-credentials","refresh_token","password")
					.scopes("server");

		}

		@Override
		public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {

			endpoints
					.tokenStore(tokenStore)
					.authenticationManager(authenticationManager)
					.userDetailsService(userServiceDetail);
		}
	}

}
