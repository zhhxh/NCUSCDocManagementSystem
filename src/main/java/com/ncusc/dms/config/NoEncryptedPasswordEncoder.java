package com.ncusc.dms.config;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * 供测试用不加密的密码编码器
 * @author WANGHAO
 * @version 1.0.0
 */
public class NoEncryptedPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        if(charSequence.toString().equals(s)){
            return true;
        }
        else
            return false;
    }
}
