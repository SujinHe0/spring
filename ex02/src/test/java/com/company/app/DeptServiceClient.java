package com.company.app;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.app.dept.service.DeptService;
import com.company.app.dept.service.DeptVO;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DeptServiceClient {

	@Autowired DeptService service;
	
//	@Test
	public void insertDept() {
		DeptVO vo = new DeptVO();
		vo.setDepartmentName("«œ¿Ã∑Á");
		int r = service.insertDept(vo);
		log.info(vo);
	}
	
	@Test
	public void getDeptAll() {
		DeptVO vo = new DeptVO();
		List<DeptVO> list =  service.getDeptAll(vo);
		list.forEach(dept -> log.info(dept));
	}
}
