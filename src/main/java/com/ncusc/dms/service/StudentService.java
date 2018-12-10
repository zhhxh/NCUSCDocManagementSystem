/**
 * StudentService.java
 *  
 * Dec 10, 2018
 * Newkey
 * 
 */
package com.ncusc.dms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ncusc.dms.mapper.StudentAccountMapper;
import com.ncusc.dms.mapper.StudentMapper;
import com.ncusc.dms.pojo.Student;
import com.ncusc.dms.pojo.StudentAccount;

/**
 * @author Newkey
 *
 */
@Service
public class StudentService {
       @Autowired
       StudentMapper studentMapper;
       @Autowired
       StudentAccountMapper studentAccountMapper;
       /**
        * 学生注册账户的事务
        * @param student
        * @param studentAccount
        *
        */
       @Transactional(rollbackFor = Exception.class)
       public void add(Student student,StudentAccount studentAccount){
    	     studentMapper.add(student);
    	     studentAccountMapper.add(studentAccount);
       }
}
