package com.company.app.dept.service;

import java.util.List;

public interface DeptService {
	
	int insertDept(DeptVO vo);
	
	//��ü��ȸ
	List<DeptVO> getDeptAll(DeptVO vo);
}
