package com.TrueTech.org.dao;



	import org.springframework.data.repository.CrudRepository;
	import org.springframework.stereotype.Repository;

	import com.TrueTech.org.model.User;

	@Repository
	public interface UserRepository extends CrudRepository<User, Long>{
		
	}