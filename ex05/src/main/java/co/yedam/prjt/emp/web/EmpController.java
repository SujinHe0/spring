package co.yedam.prjt.emp.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.yedam.prjt.common.Paging;
import co.yedam.prjt.emp.mapper.EmpMapper;
import co.yedam.prjt.emp.service.EmpService;
import co.yedam.prjt.emp.service.EmpVO;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/emp")
@Log4j
public class EmpController {
	
	@Autowired EmpService empService;
	@Autowired EmpMapper mapper; //원래는 서비스 만들어서 해야함.
	
	//등록페이지 이동
	@GetMapping("/insert")
	//같은 이름으로 알아서 찾아감
	public void insert(Model model) {
		model.addAttribute("jobs", mapper.getJobs());

	} 
	
	//등록처리
	@PostMapping("/insert") //유형이다르면 같은 url로 처리가능 메서드나, 매개변수가 다른경우 다르게
	public String insertProc(EmpVO vo, RedirectAttributes rttr) {
		empService.addEmp(vo);
		rttr.addFlashAttribute("result", "true");  //한번만 전달가능
		//addFlash 새로고침하면 사라진다.  최초한번만 1회성으로 사용!
		rttr.addAttribute("result", "true");  //이동할때마다? 값 계속 전달
		//읽어낼때 param넣어서 읽어야한다. 
		return "redirect:/emp/list";
	}
	//수정 페이지 이동
	@GetMapping("/update")
	public String update(Model model, @RequestParam String id) {
		//단건조회에서 이어짐 , 수정페이지도 아이디정보로 검색한 조회결과필요
			model.addAttribute("emp", empService.getEmp(id));
		return "emp/update";
	}
	//수정 처리
	@PostMapping("/update")
	public String updateProc(EmpVO vo, RedirectAttributes rttr) {
		log.info(vo);
		empService.updateName(vo);
		rttr.addFlashAttribute("result", "수정완료");
//		rttr.addAttribute("id",)
		return "redirect:/emp/list";
	}
	//삭제 처리
	
	@PostMapping("/delete")
	public String delete(String id, RedirectAttributes rttr) {
		empService.deleteEmp(id);
		rttr.addFlashAttribute("result", "삭제완료");
		return "redirect:/emp/select";
	}
	
	//전체조회 페이지
	@GetMapping("/list") //모델뷰 뷰랑.. 기능?처리함께하는
	public ModelAndView list(EmpVO vo, Paging paging) {
//		ModelAndView mv = new ModelAndView("/emp/list");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/emp/list");
		mv.addObject("emps", empService.getEmpAll(vo, paging));
		return mv;
	}
	
	//단건조회 페이지
	@GetMapping("/select")
	public String select(Model model, @RequestParam String id) {
		model.addAttribute("emp", empService.getEmp(id));
		return "emp/select";
	}
	//삭제 겟
	
	//조회 겟
	
	//단건조회 겟
}
