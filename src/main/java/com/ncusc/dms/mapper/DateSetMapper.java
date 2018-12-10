package com.ncusc.dms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ncusc.dms.pojo.DateSet;

/**
 * DateSet 映射
 * @author fxd
 * @version 1.0.0
 */
@Mapper
public interface DateSetMapper {
	/**
	 * 添加时间设置
	 * @param dateset DateSet对象
	 * @return 添加条数
	 * */
	public int add(DateSet dateset);
	/**
	 * 获取所有时间设置集
	 * @return 时间设置List对象(List<DateSet>)
	 * */
	public List<DateSet> list();
	/**
	 * 通过教师选课ID来删除时间设置
	 * @param tcId 教师选课ID
	 * @return 删除条数
	 * */
	public int deleteCDateSet(@Param("tcId")String tcId); //只能根据教师选课的来删除
													//如：教c++课的万老师(t-0001):t-0001c++ 在后台实现的时候
													//教师删除曾经的设置的时间时，根据当前登录的教师和点击的课程，可以获得tcId
													//此句为删除该教师该门课所有的时间设置
	/**
	 * 通过布置的work类型删除时间设置集
	 * @param dType work类型
	 * @return 删除条数
	 * */
	public int deleteCDateSetByType(@Param("dType")String dType); //获取dType过程同上，后台为选择的实验类型，如实验一，大作业等等
																	//此句为删除该老师该门课某次实验的时间设置
	/**
	 * 通过布置的work类型重置时间集
	 * @param dType work类型
	 * @param tcId 教师选课ID
	 * @return 更新条数
	 * */
	public int updateCDateSetByType(@Param("dType")String dType,@Param("id")String tcId);  //获取dType过程同上，该句为修改某一次实验的时间设置
	/**
	 * 通过布置的work类型查询时间集
	 * @param dType work类型
	 * @param tcId 教师选课ID
	 * return 时间设置集List(List<DateSet>)
	 * */
	public List<DateSet> getCDateSet(@Param("dType")String dType,@Param("id")String tcId); //查询某一教师某门课的某次实验的设置  实现时的where 是tcId && dType
	

}
