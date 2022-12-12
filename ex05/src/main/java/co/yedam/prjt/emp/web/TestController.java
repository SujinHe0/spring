package co.yedam.prjt.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import co.yedam.prjt.emp.service.EmpService;
import co.yedam.prjt.emp.service.EmpVO;
import co.yedam.prjt.emp.service.UserListVO;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/test")
@Log4j
public class TestController {
	
	@Autowired EmpService empService;
	
	//등록
	@RequestMapping("/insert") //  /emp/insert로 요청
	public String insert(EmpVO vo) { // url 넘겨줘서 string으로
		log.info(vo);
		return "home";
	}
	
	//등록
	@RequestMapping("/insertListPage") //  /emp/insert로 요청
	public String insertListPage() { // url 넘겨줘서 string으로
		return "empInsertList";
	}
	
//	@RequestMapping(path="/insertList", method = {RequestMethod.GET, RequestMethod.POST}) //  /emp/insert로 요청
	@PostMapping //짧게 줄여서..
	//리퀘스트보다는 맵이랑 포스트 구분해서 사용하기
	public String insertList(UserListVO vo) { // url 넘겨줘서 string으로
		log.info(vo);
		return "home";
	}
	
	@RequestMapping("/params")
	public String params (@RequestParam List<String> employeeIds) {
		log.info(employeeIds);
		return "main";
	}
	
	
	//등록
	@RequestMapping("/insertparam")
	public String insertParam( int age,
							   @RequestParam(name ="userId") String firstName, 
							   @RequestParam(required=false, defaultValue="kim") String lastName) { //@RequestParam 생략가능 
		// String firstName = request.getParameter("firstName")과 같다
		//request를 적으면 필수로 넘겨주어야한다.
		log.info(age);
		log.info(lastName);
		log.info(firstName);
		return "home";

	}
	//수정
	
	//삭제
	@RequestMapping("delete")
	public String delete(@RequestParam(name="id") String employeeId) {
		empService.deleteEmp(employeeId);
		return "home";
	}
	
	//삭제
	@RequestMapping("delete/{empid}/{deptid}")  // {{}} 이름과 매개변수 이름이 같아야한다.
	public String deletePath (@PathVariable String empid,
								@PathVariable int deptid) {
		log.info(empid);
		log.info(deptid);
//		empService.deleteEmp(id);
		return "home";
	}
	//조회
}
