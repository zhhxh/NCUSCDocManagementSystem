/**
 * Student_CourseRepository.java
 *  
 * Nov 24, 2018
 * Newkey
 * 
 */
package com.ncusc.dms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ncusc.dms.pojo.Student_Course;

/**
 * @author Newkey
 *
 */
public interface Student_CourseRepository extends JpaRepository<Student_Course,Integer>{
      @Query(value="select * from t_stu_course where s_id =:id",nativeQuery=true)
     List<Student_Course> getScInfo(@Param("id")String id);
	
}
