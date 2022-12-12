package co.yedam.prjt.emp.mapper;

import java.util.List;

import co.yedam.prjt.common.Paging;
import co.yedam.prjt.emp.service.DeptVO;

public interface DeptMapper {
	
	//등록, 수정
	int insertDept(DeptVO vo);
	int updateDept(DeptVO vo);
	
	//부서조회
	DeptVO getDept(String deptId);
	
	//부서목록
	List<DeptVO> getDeptAll(DeptVO vo, Paging paging);
}
