package com.ncusc.dms.mapper;
import java.util.List;

import com.ncusc.dms.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Admin 映射
 * @author WANGHAO
 * @version 1.0.0
 */
@Mapper
public interface AdminMapper {
    //TODO 添加未实现的SQL注解
    public void add(Admin admin);		    //增
    public void delete(int aId);		    //删
    public void update(Admin admin);	    //改
    public Admin get(int aId);			    //查
    @Select("select * from admin_info ")
    public List<Admin> list();             //获取所有
}
