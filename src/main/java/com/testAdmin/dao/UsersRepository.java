package com.testAdmin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.testAdmin.repository.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
	@Query("SELECT a FROM users a WHERE a.ac=:ac")
	public Users findOneByAc(@Param("ac") String ac);

}
