/**
 * TeacherAccountRepository.java
 *  
 * Nov 24, 2018
 * Newkey
 * 
 */
package com.ncusc.dms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ncusc.dms.pojo.TeacherAccount;

/**
 * @author Newkey
 *
 */
public interface TeacherAccountRepository extends JpaRepository<TeacherAccount,String>{
        
}
