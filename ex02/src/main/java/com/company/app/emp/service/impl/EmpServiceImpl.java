package com.company.app.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.company.app.common.Paging;
import com.company.app.emp.mapper.EmpMapper;
import com.company.app.emp.service.EmpService;
import com.company.app.emp.service.EmpVO;

import lombok.extern.log4j.Log4j;

@Service //�� ���, Ʈ����� ó��


//����Ŭ������ �� ����ؾ���
public class EmpServiceImpl implements EmpService{

	@Autowired EmpMapper empMapper;
	
	@Override
	public List<EmpVO> getEmpAll(EmpVO vo, Paging paging) {
		paging.setTotalRecord(empMapper.count(vo));  //start end 검색
		vo.setFirst(paging.getFirst());
		vo.setLast(paging.getLast());
		return empMapper.getEmpAll(vo);
	}

	@Override
	public EmpVO getEmp(String id) {
		// TODO Auto-generated method stub
		return empMapper.getEmp(id);
	}

	@Override
	public int addEmp(EmpVO vo) {
		// TODO Auto-generated method stub
		return empMapper.addEmp(vo);
	}

	@Override
	public int updateName(EmpVO vo) {
		// TODO Auto-generated method stub
		return empMapper.updateName(vo);
	}

	@Override
	public int deleteEmp(String id) {
//		return empMapper.deleteEmp(id);
		int check = empMapper.getManagerCheck(id);
		if(check == 0) {
			return empMapper.deleteEmp(id);
		} else {			
			System.out.println("���� �Ұ�");
			return 0;
		}
	}

}
