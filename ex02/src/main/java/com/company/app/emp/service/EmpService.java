package com.company.app.emp.service;

import java.util.List;


//�ַ� ����ڰ� Ŭ���ϴ� ��ư..������ ���񽺵�! ȭ���������̽��� ���߸�ȴ�
//�Ŵ���Ȯ�ο��δ� ���� �̿� X .. 
public interface EmpService {
	//��ü��ȸ
	List<EmpVO> getEmpAll(EmpVO vo);
	
	//�ܰ���ȸ
	EmpVO getEmp(String id);
	
	//���
	int addEmp(EmpVO vo);
	
	//����
	int updateName(EmpVO vo);
	
	//����
	int deleteEmp(String id);
	
	
}
