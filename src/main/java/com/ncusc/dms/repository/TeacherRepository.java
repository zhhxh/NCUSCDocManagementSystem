/**
 * TeacherRepositoty.java
 *  
 * Nov 23, 2018
 * Newkey
 * 
 */
package com.ncusc.dms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ncusc.dms.pojo.Teacher;

/**
 * @author Newkey
 *
 */
public interface TeacherRepository extends JpaRepository<Teacher,String>{

}
