package com.ncusc.dms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ncusc.dms.pojo.TeacherAccount;

/**
 * TeacherAccount 映射
 * @author fxd
 * @version 1.0.0
 */
@Mapper
public interface TeacherAccountMapper {
	/**
	 * 添加教师账户信息
	 * @param teacherAccount 教师账户对象
	 * @return 添加条数
	 * */
	public int add(TeacherAccount teacherAccount);
	/**
	 * 获取所有教师账户信息
	 * @return  教师账户List(List<TeachertAccount>)
	 * */
	public List<TeacherAccount> list();
	/**
	 *通过工号查询教师信息
	 * @param tId 工号
	 * @return 教师账户信息对象
	 * */
	public TeacherAccount getById(@Param("id")String tId);
	/**
	 * 通过手机号查询教师账户信息
	 * @param telNum 手机号
	 * @return 教师账户信息对象
	 * */
	public TeacherAccount getByTel(@Param("telNum")String telNum); //根据手机号查询，为了扩展，手机号不能重复 版本2
	/**
	 * 通过邮箱查询教师账户信息
	 * @param email 邮箱
	 * @return 教师账户信息对象*/
	public TeacherAccount getByEmail(@Param("email")String email); //根据email查询，为了扩展到email登录,不能重复 版本2
	/**
	 * 更新教师账户信息
	 * @param teacherAccount 教师账户对象
	 * @return 更新条数
	 * */
	public int update(TeacherAccount teacherAccount); //版本1，实现时where处为 where sId=;后面版本需要加telNum/email
	/**
	 * 通过工号删除教师账户信息
	 * @param tId 工号
	 * @return 删除条数
	 * */
	public int delete(@Param("id")String tId); //此句同上
}
