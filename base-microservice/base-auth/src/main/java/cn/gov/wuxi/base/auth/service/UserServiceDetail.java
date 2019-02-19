package cn.gov.wuxi.base.auth.service;

import cn.gov.wuxi.base.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Author:流氓兔
 * Date:2019/2/19
 **/
@Service
public class UserServiceDetail implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String usernme) throws UsernameNotFoundException {
        return userRepository.findByUsername(usernme);
    }
}
