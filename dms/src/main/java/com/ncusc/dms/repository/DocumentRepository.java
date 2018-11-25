/**
 * DocumentRepository.java
 *  
 * Nov 24, 2018
 * Newkey
 * 
 */
package com.ncusc.dms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ncusc.dms.pojo.Document;

/**
 * @author Newkey
 *
 */
public interface DocumentRepository extends JpaRepository<Document,String>{

}
