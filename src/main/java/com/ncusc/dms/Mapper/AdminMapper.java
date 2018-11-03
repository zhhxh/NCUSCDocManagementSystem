package com.ncusc.dms.Mapper;
import java.util.List;

import com.ncusc.dms.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminMapper {
    public void add(Admin admin);		    //增
    public void delete(int aId);		    //删
    public void update(Admin admin);	    //改
    public Admin get(int aId);			    //查
    @Select("select * from admin_info ")
    public List<Admin> list();             //获取所有
}
