package com.ncusc.dms.mapper;
import java.util.List;

import com.ncusc.dms.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * Admin 映射
 * @author WnGHAO
 * @version 1.0.0
 */
@Mapper
public interface AdminMapper {
//    @Insert("insert into admin_info (id,password,aName,sex,phoNum,email,addr,level,regDate)"  +
//            "values (#{id},#{password},#{aName},#{sex},#{phoNum},#{email},#{addr},#{level},#{regDate})")
    public void add(Admin admin);		    //增
//    @Delete("delete from admin_info where id= #{id}")
    public void delete(@Param("id")String id);		    //删
//    @Update("update admin_info set " +
//            "password=#{password},aName=#{aName},sex=#{sex},phoNum=#{phoNum},email=#{email}," +
//            "addr=#{addr},level=#{level},regDate=#{regDate}  where id=#{id}")
    public void update(Admin admin);	    //改
//    @Select("select * from admin_info  where id= #{id}")
    public Admin get(@Param("id")String id);			    //查
  //  @Select("select * from admin_info")
    public List<Admin> list();             //获取所有
}
