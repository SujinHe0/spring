package com.company.app.emp;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

public interface EmpMapper {
	
	List<EmpVO> getEmpAll(EmpVO vo);
	EmpVO getEmp(String id);
	
	int count(EmpVO vo);
	
	//insert, update, delete는 다 int로 받는다
	int addEmp(EmpVO vo);
	int updateName(EmpVO vo);
	
	@Select("select * from departments")
	public List<Map<String,Object>> getDept();
	
	public List<Map<String,Object>> getDeptAll();
}
