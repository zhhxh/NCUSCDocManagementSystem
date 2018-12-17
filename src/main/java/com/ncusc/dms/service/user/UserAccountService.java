package com.ncusc.dms.service.user;

import com.ncusc.dms.mapper.UserAccountMapper;
import com.ncusc.dms.pojo.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * 登陆集中授权处理
 * @author WANGHAO
 * @version 1.0.0
 */
@Service
public class UserAccountService implements UserDetailsService {
    @Autowired
    UserAccountMapper userAccountMapper;

    /**
     * 返回用户验证信息供Spring Security使用
     * @param str 注意：参数为用户id
     * @return UserDetails对象
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String str) throws UsernameNotFoundException {
        UserAccount userAccount = userAccountMapper.findUserAccountByUserId(str);
        if (userAccount == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        Set<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();
        grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_"+userAccount.getAuthority()));//默认是ROLE_开头
        return new User(userAccount.getName(), userAccount.getPassword(), grantedAuthorities);

    }
}