/**
 * StudentRepositoty.java
 *  
 * Nov 23, 2018
 * Newkey
 * 
 */
package com.ncusc.dms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ncusc.dms.pojo.Student;

/**
 * @author Newkey
 *
 */
public interface StudentRepository extends JpaRepository<Student,String>{
    
}
