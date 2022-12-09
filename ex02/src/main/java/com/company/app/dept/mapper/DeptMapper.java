package com.company.app.dept.mapper;

import java.util.List;

import com.company.app.dept.service.DeptVO;

public interface DeptMapper {
	//등록
	int insertDept(DeptVO vo);

	//전체조회
	List<DeptVO> getDeptAll(DeptVO vo);
}
