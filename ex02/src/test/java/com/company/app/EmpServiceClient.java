package com.company.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.app.emp.service.EmpService;
import com.company.app.emp.service.EmpVO;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class EmpServiceClient {

	@Autowired EmpService service;
	
//	@Test
	public void delEmp() {
		int r = service.deleteEmp("208");
		log.info(r);
	}
	
	
	@Test
	public void getEmp() {
		EmpVO vo = service.getEmp("208");
	}
}
