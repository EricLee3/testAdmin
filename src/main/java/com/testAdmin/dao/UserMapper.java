package com.testAdmin.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.testAdmin.repository.entity.User;

@Mapper
public interface UserMapper {
	public User readUser(String username);
	public List<String> readAuthority(String username);

}
