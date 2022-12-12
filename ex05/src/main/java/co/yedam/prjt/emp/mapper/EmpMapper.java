package co.yedam.prjt.emp.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import co.yedam.prjt.emp.service.EmpVO;

public interface EmpMapper {
	List<Map<String, Object>> getJobs();
	List<EmpVO> getEmpAll(EmpVO vo);
	EmpVO getEmp(String id);
	
	int count(EmpVO vo);
	
	//insert, update, delete는 인트로
	int addEmp(EmpVO vo);
	int updateName(EmpVO vo);
	int updEmp(EmpVO vo);
	
	//회원삭제
	int deleteEmp(String id);
	//삭제 시 매니저로 등록되어있는지 확인
	int getManagerCheck(String id);
	
	@Select("select * from departments")
	public List<Map<String,Object>> getDept();
	public List<Map<String,Object>> getDeptAll();
}
