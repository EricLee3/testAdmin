package com.testAdmin.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.testAdmin.domain.entity.Hello;


public interface HelloDao extends JpaRepository <Hello, Integer>{

}
