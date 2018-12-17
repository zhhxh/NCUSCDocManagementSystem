package com.ncusc.dms.pojo;


import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录信息，授权信息
 * 表信息：
 * {@code CREATE TABLE `dmsdb`.`t_user_account` (
 *   `id` VARCHAR(20) NOT NULL,
 *   `name` VARCHAR(45) NOT NULL,
 *   `password` VARCHAR(100) NOT NULL,
 *   `authority` VARCHAR(45) NOT NULL DEFAULT 'USER',
 *   PRIMARY KEY (`id`));
 *   insert into dmsdb.t_user_account values("0","wanghao","123456","ROOT");
 *   insert into dmsdb.t_user_account values("1","wanghao","123456","ADMIN");
 *   insert into dmsdb.t_user_account values("2","wanghao","123456","USER");
 *   }
 * @author WANGHAO
 * @version 1.0.0
 */
@Data
public class UserAccount implements Serializable {
    private String id;              //用户ID
    private String name;            //用户姓名
    private String password;        //用户密码
    private String authority;       //用户权限
}
