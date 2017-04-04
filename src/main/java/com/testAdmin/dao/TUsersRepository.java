package com.testAdmin.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.testAdmin.repository.entity.TUsers;

public interface TUsersRepository extends JpaRepository<TUsers, Long> {
	@Query("SELECT a FROM users a WHERE a.ac=:ac")
	public TUsers findOneByAc(@Param("ac") String ac);

}
