package com.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.domain.entity.Hello;


public interface HelloDao extends JpaRepository <Hello, Integer>{

}
