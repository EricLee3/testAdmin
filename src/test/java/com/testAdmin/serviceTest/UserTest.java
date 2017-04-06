package com.testAdmin.serviceTest;


import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
 
import java.util.List;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.testAdmin.repository.entity.User;
import com.testAdmin.TestAdminApplicationTests;
import com.testAdmin.dao.UserMapper;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class UserTest {
	@Autowired UserMapper userMapper;
	
	@Test
	public void readUserTest()  {
		User user = userMapper.readUser("cusonar");
		assertThat("cusonar", is(user.getUsername()));
		assertThat("YCU", is(user.getName()));
	}
}
