package com.ncusc.dms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ncusc.dms.pojo.StudentAccount;

/**
 * StudentAccount 映射
 * @author fxd
 * @version 1.0.0
 */
@Mapper
public interface StudentAccountMapper {
	/**
	 * 添加学生账户信息入库
	 * @param studentAccount 学生账户对象
	 * @return 添加条数
	 * */
	public int add(StudentAccount studentAccount);
	/**
	 * 获取所有学生账户信息
	 * @return 学生账户对象List(List<StudentAccount>)
	 * */
	public List<StudentAccount> list();
	/**
	 * 通过账号查询学生账户信息
	 * @param sId 学号
	 * @return 学生账户(StudentAccount)对象
	 * */
	public StudentAccount getById(@Param("id")String sId);
	/**
	 * 通过手机号查询学生账户信息
	 * @param telNum 手机号
	 * @return 学生账户(StudentAccount)对象
	 * */
	public StudentAccount getByTel(@Param("telNum")String telNum); //根据手机号查询，为了扩展，手机号不能重复 版本2
	/**
	 * 通过邮箱查询学生账户信息
	 * @param email 邮箱
	 * @return 学生账户(StudentAccount)对象
	 * */
	public StudentAccount getByEmail(@Param("email")String email); //根据email查询，为了扩展到email登录,不能重复 版本2
	/**
	 * 更新学生账户信息
	 * @param studentAccount StudentAccount对象
	 * @return 更新条数
	 * */
	public int update(StudentAccount studentAccount); //版本1，实现时where处为 where sId=;后面版本需要加telNum/email
	/**
	 * 根据学号删除学生账户
	 * @param sId 学号
	 * @return 删除条数
	 * */
	public int delete(@Param("id")String sId); //此句同上
	

}
