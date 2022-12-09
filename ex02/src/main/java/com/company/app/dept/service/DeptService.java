package com.company.app.dept.service;

import java.util.List;

public interface DeptService {
	//등록 
	int insertDept(DeptVO vo);
	
	//전체조회
	List<DeptVO> getDeptAll(DeptVO vo);
}
