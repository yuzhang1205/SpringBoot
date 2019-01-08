package com.example.demo.ServiceTest;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.demo.DemoApplication;
import com.demo.until.LogCommon;



@SpringBootTest(classes=DemoApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestDataSource {
	@Resource
	private DataSource dataSource;
	
	@Test
	public void testConnection() throws Exception{
		LogCommon.LogCommon().debug("sss");
		System.out.println("数据池连接测试：");
		System.out.println(this.dataSource);
	}
}
