package com.company.app;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.app.emp.EmpMapper;
import com.company.app.emp.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class SqlSessionClient {

	@Autowired SqlSession mybatis;
	@Autowired EmpMapper mapper;
	
	@Test
	public void getEmplAll() {
		EmpVO vo = new EmpVO();
//		vo.setDepartmentId("20");
//		vo.setFirstName("at");
		vo.setEmployeeIds(Arrays.asList("100", "101", "102"));
		List<EmpVO> list = mapper.getEmpAll(vo);
		if(list !=null) {
			list.forEach(emp -> System.out.println(emp.getFirstName()));
		}
	}
//	@Test
	public void addEmp() {
		EmpVO vo = new EmpVO();
//		vo.setFirstName(null);
		vo.setEmail("aa@mai21.com");
		vo.setLastName("김");
		vo.setJobId("IT_PROG");
		vo.setHireDate("2022/12/08");
		int result = mapper.addEmp(vo);
		System.out.println(result + "건이 등록");
	}
	
//	@Test
	public void getDept() {
//		System.out.println(mapper.getDept().get(0).get("DEPARTMENT_NAME"));
		List<Map<String, Object>> list = mapper.getDeptAll();
		//부서명만 모두 출력
		list.forEach(dept -> {
				System.out.println(dept.get("departmentName"));
		});
		//배열, 맵 포문 기억안남 ㅠㅠ
//		for(let i=0; i<list.size(); i++) {
//			
//		}
	}
	
	
	//@Test
	public void mapperUpdate() {
		EmpVO vo = new EmpVO();
		vo.setFirstName("강일번");
		vo.setEmployeeId("100");
		int r = mapper.updateName(vo);
		System.out.println(r+"건이 수정되었습니다.");
	}
	
//	@Test
	public void mapperSelect() {
		EmpVO vo = mapper.getEmp("100");
		System.out.println("===="+vo);
	}
	
	//@Test
	public void select() {
		EmpVO vo =mybatis.selectOne("com.company.app.emp.EmpMapper.getEmp", "100");
		System.out.println(vo);
		
	}
}
