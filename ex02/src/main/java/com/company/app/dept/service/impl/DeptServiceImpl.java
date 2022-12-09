package com.company.app.dept.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.company.app.dept.mapper.DeptMapper;
import com.company.app.dept.service.DeptService;
import com.company.app.dept.service.DeptVO;

@Component
public class DeptServiceImpl implements DeptService{
	
	@Autowired DeptMapper mapper;
	
	@Override
	public int insertDept(DeptVO vo) {
		return mapper.insertDept(vo);
	}

	@Override
	public List<DeptVO> getDeptAll(DeptVO vo) {
		return mapper.getDeptAll(vo);
	}

}
