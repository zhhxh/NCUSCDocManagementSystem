/**
 * WorksRepository.java
 *  
 * Nov 24, 2018
 * Newkey
 * 
 */
package com.ncusc.dms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ncusc.dms.pojo.Works;

/**
 * @author Newkey
 *
 */
public interface WorksRepository extends JpaRepository<Works,String>{

}
