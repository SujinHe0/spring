package co.yedam.prjt.emp.service;

import java.util.List;

import co.yedam.prjt.common.Paging;

public interface DeptService {
	
	//등록, 수정
	int insertDept(DeptVO vo);
	int updateDept(DeptVO vo);
	
	//부서조회
	DeptVO getDept(String deptId);
	
	//부서목록
	List<DeptVO> getDeptAll(DeptVO vo, Paging paging);
}
