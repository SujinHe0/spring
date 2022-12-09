package com.company.app.emp.service;

import java.util.List;


//주로 사용자가 클릭하는 버튼..에관한 서비스들! 화면인터페이스와 맞추면된다
//매니저확인여부는 고객이 이용 X .. 
public interface EmpService {
	//전체조회
	List<EmpVO> getEmpAll(EmpVO vo);
	
	//단건조회
	EmpVO getEmp(String id);
	
	//등록
	int addEmp(EmpVO vo);
	
	//수정
	int updateName(EmpVO vo);
	
	//삭제
	int deleteEmp(String id);
	
	
}
