package com.company.app.emp.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.company.app.emp.service.EmpVO;

public interface EmpMapper {
	
	List<EmpVO> getEmpAll(EmpVO vo);
	EmpVO getEmp(String id);
	
	int count(EmpVO vo);
	
	//insert, update, delete는 다 int로 받는다
	int addEmp(EmpVO vo);
	int updateName(EmpVO vo);
	
	//삭제
	int deleteEmp(String id);
	//매니저여부 확인쿼리
	int getManagerCheck(String id);
	
	@Select("select * from departments")
	public List<Map<String,Object>> getDept();
	public List<Map<String,Object>> getDeptAll();
}
