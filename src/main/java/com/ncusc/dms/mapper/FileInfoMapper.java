package com.ncusc.dms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ncusc.dms.pojo.FileInfo;

/**
 * FileInfo 映射
 * @author fxd
 * @version 1.0.0
 */
@Mapper
public interface FileInfoMapper {

	/**
	 * 添加文件
	 * @param file FileInfo对象
	 * @return 插入数据库的记录条数
	 */
	public int add(FileInfo file);

	/**
	 * 列出所有文件
	 * @return 文件List对象（List<FileInfo>）
	 */
	public List<FileInfo> list();

	/**
	 * 更新文件
	 * @param file FileInfo对象
	 * @return 更新的记录条数
	 */
	public int update(FileInfo file);

	/**
	 * 根据文件ID查询文件
	 * @param fId 文件ID
	 * @return FileInfo对象
	 */
	public FileInfo getById(@Param("id")String fId);

	/**
	 * 根据文件名查询文件
	 * @param fName 文件名
	 * @return 文件List对象（List<FileInfo>）
	 */
	public List<FileInfo> getByName(@Param("fName")String fName);

	/**
	 * 根据文件类型查询文件
	 * @param fType 文件类型
	 * @return 文件List对象（List<FileInfo>）
	 */
	public List<FileInfo> getByType(@Param("fType")String fType);

	/**
	 * 根据作者查询文件
	 * @param Owner 作者
	 * @return 文件List对象（List<FileInfo>）
	 */
	public List<FileInfo> getByOwner(@Param("owner")String Owner); //此处传入的是sId,或者tId

	/**
	 * 根据文件名删除文件
	 * @param fName
	 * @return 删除的记录条数
	 */
	public int deleteByName(@Param("fName")String fName);

	/**
	 * 根据文件id删除文件
	 * @param fId
	 * @return 删除的记录条数
	 */
	public int deleteById(@Param("id")String fId);
	
	//TODO 文件部分暂时到这，还有很多，需要根据具体功能来写

}
