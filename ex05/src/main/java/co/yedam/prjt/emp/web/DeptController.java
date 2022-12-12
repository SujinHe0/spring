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
import co.yedam.prjt.emp.service.DeptService;
import co.yedam.prjt.emp.service.DeptVO;
import lombok.extern.log4j.Log4j;

@RequestMapping("/dept")
@Controller
@Log4j
public class DeptController {
	
	@Autowired DeptService deptService;
	
	//전체 리스트 조회
	@GetMapping("/list")
	public ModelAndView list (DeptVO vo, Paging paging) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/dept/list");
		mv.addObject("depts", deptService.getDeptAll(vo, paging));
		return mv;
	}
	
	
	//단건조회
	@GetMapping("/select")
	public String select(Model model, @RequestParam String id) {
		model.addAttribute("dept", deptService.getDept(id));
		return "emp/select";
	}
	//등록 페이지
	@GetMapping("/insert")
	public void insert() {}
	
	//등록 처리
	@PostMapping("/insert")
	public String insertProc(DeptVO vo, RedirectAttributes rttr) {
		deptService.insertDept(vo);
		rttr.addFlashAttribute("result", "부서 등록 완료");
		//등록하고 리스트로 가기
		return "redirect:/dept/list";
	}
}
