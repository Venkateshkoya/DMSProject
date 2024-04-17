/**
 * 
 */
package com.venkatesh.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.venkatesh.DMS.Models.Dog;

/**
 * @author Venkatesh Koya
 */
public interface DogRepository extends CrudRepository<Dog, Integer>{
	List <Dog> findByName(String name);

}
