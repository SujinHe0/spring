package co.yedam.prjt.emp.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.yedam.prjt.common.Paging;
import co.yedam.prjt.emp.mapper.DeptMapper;
import co.yedam.prjt.emp.service.DeptService;
import co.yedam.prjt.emp.service.DeptVO;


@Component
public class DeptServiceImpl implements DeptService{

	@Autowired DeptMapper deptMapper;
	
	@Override
	public int insertDept(DeptVO vo) {
		// TODO Auto-generated method stub
		return deptMapper.insertDept(vo);
	}

	@Override
	public int updateDept(DeptVO vo) {
		// TODO Auto-generated method stub
		return deptMapper.updateDept(vo);
	}

	@Override
	public DeptVO getDept(String deptId) {
		// TODO Auto-generated method stub
		return deptMapper.getDept(deptId);
	}

	@Override
	public List<DeptVO> getDeptAll(DeptVO vo, Paging paging) {
		// TODO Auto-generated method stub
		return deptMapper.getDeptAll(vo, paging);
	}
	

}
