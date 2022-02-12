package cn.geekhall.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * UserDetailsServiceImpl
 *
 * @author yiny
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("执行了loadUserByUsername 方法");
        // 1. 查询数据库判断用户名是否存在，如果不存在就抛出异常
        if (!"admin".equals(username)){
            throw new UsernameNotFoundException("用户名不存在");
        }
        // 2. 把查询出来的密码进行解析
        String password = passwordEncoder.encode("123");
        return new User(username, password, AuthorityUtils.commaSeparatedStringToAuthorityList("admin, normal"));
    }
}
