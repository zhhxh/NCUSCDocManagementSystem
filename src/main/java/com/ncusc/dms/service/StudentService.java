/**
 * StudentService.java
 *  
 * Nov 24, 2018
 * Newkey
 * 
 */
package com.ncusc.dms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ncusc.dms.pojo.Student;
import com.ncusc.dms.pojo.StudentAccount;
import com.ncusc.dms.pojo.Student_Course;
import com.ncusc.dms.repository.StudentAccountRepository;
import com.ncusc.dms.repository.StudentRepository;
import com.ncusc.dms.repository.Student_CourseRepository;

/**
 * @author Newkey
 *
 */
public class StudentService {
     @Autowired
     StudentRepository studentRepository;
     @Autowired
     StudentAccountRepository saRepository;
     @Autowired
     Student_CourseRepository scRepository;
     
     @Transactional(rollbackFor = Exception.class)
     public void create(Student stu, StudentAccount sa){
    	  studentRepository.save(stu);
    	  saRepository.save(sa);
     }
     
     public void delete(String s_id){
    	 List<Student_Course> list = scRepository.getScInfo(s_id);
    	 for(Student_Course sc:list){
    		 scRepository.delete(sc);
    	 }
    	 saRepository.deleteById(s_id);
    	 studentRepository.deleteById(s_id);
     }
}
