/**
 * StudentAccountRepository.java
 *  
 * Nov 24, 2018
 * Newkey
 * 
 */
package com.ncusc.dms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ncusc.dms.pojo.StudentAccount;

/**
 * @author Newkey
 *
 */
public interface StudentAccountRepository extends JpaRepository<StudentAccount,String>{

}
