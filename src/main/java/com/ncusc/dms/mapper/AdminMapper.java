package com.ncusc.dms.mapper;
import java.util.List;

import com.ncusc.dms.pojo.Admin;
import org.apache.ibatis.annotations.*;


/**
 * Admin 映射
 * @author WANGHAO
 * @version 1.0.0
 */
@Mapper
public interface AdminMapper {
    /**
     * 插入一条管理员记录
     * @param admin  Admin对象
     *
     */
    @Insert("insert into admin_info (id,password,aName,sex,phoNum,email,addr,level,regDate)"  +
            "values (#{id},#{password},#{aName},#{sex},#{phoNum},#{email},#{addr},#{level},#{regDate})")
    public void add(Admin admin);

    /**
     * 根据管理员ID删除管理员
     * @param id 管理员ID
     */
    @Delete("delete from admin_info where id= #{id}")
    public void delete(@Param("id")String id);

    /**
     * 更新管理员信息
     * @param admin Admin对象
     */
    @Update("update admin_info set " +
           "password=#{password},aName=#{aName},sex=#{sex},phoNum=#{phoNum},email=#{email}," +
            "addr=#{addr},level=#{level},regDate=#{regDate}  where id=#{id}")
    public void update(Admin admin);

    /**
     * 根据管理员ID查询管理员
     * @param id 管理员ID
     * @return 管理员对象(Admin)
     */
    @Select("select * from admin_info  where id= #{id}")
    public Admin get(@Param("id")String id);

    /**
     * 列出所有管理员
     * @return 管理员列表(List<Admin>)
     */
    @Select("select * from admin_info")
    public List<Admin> list();
}
