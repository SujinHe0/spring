package com.company.app.dept.mapper;

import java.util.List;

import com.company.app.dept.service.DeptVO;

public interface DeptMapper {
	//���
	int insertDept(DeptVO vo);

	//��ü��ȸ
	List<DeptVO> getDeptAll(DeptVO vo);
}
