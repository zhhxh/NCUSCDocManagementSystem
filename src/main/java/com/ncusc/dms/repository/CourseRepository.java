/**
 * CourseRepository.java
 *  
 * Nov 24, 2018
 * Newkey
 * 
 */
package com.ncusc.dms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ncusc.dms.pojo.Course;

/**
 * @author Newkey
 *
 */
public interface CourseRepository extends JpaRepository<Course,String>{

}
