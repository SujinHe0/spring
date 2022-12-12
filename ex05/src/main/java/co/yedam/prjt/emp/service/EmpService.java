package co.yedam.prjt.emp.service;

import java.util.List;

import co.yedam.prjt.common.Paging;


//�ַ� ����ڰ� Ŭ���ϴ� ��ư..������ ���񽺵�! ȭ���������̽��� ���߸�ȴ�
//�Ŵ���Ȯ�ο��δ� ���� �̿� X .. 
public interface EmpService {
	//��ü��ȸ
	List<EmpVO> getEmpAll(EmpVO vo, Paging paging);
	
	//�ܰ���ȸ
	EmpVO getEmp(String id);
	
	//���
	int addEmp(EmpVO vo);
	
	//����
	int updateName(EmpVO vo);
	int updEmp(EmpVO vo);
	
	//����
	int deleteEmp(String id);
	
	
}
