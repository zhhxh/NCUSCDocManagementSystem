package com.ncusc.dms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ncusc.dms.pojo.FileInfo;

/**
 * Course 映射
 * @author fxd
 * @version 1.0.0
 */
@Mapper
public interface FileInfoMapper {
	public void add(FileInfo file);
	public List<FileInfo> list();
	public void update(FileInfo file);
	
	
	public FileInfo selectById(@Param("id")String fId);
	public List<FileInfo> getByName(@Param("fName")String fName);
	public List<FileInfo> getByType(@Param("fType")String fType);
	public List<FileInfo> getByOwner(@Param("owner")String Owner); //此处传入的是sId,或者tId
	public void deleteByName(@Param("fName")String fName);
	public void deleteById(@Param("id")String fId);
	
	//文件部分暂时到这，还有很多，需要根据具体功能来写

}
