package com.company.app.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.app.common.Paging;
import com.company.app.emp.service.EmpService;
import com.company.app.emp.service.EmpVO;

@Controller //@Component 컨테이너에 빈 자동등록@
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired EmpService empService;
	
	//전체조회, 검색
	@RequestMapping("/empSelectAll")
	public String empSelectAll(Model model, EmpVO vo, Paging paging) { //page
		paging.setPageUnit(3);
		model.addAttribute("emps", empService.getEmpAll(vo, paging)  );
		return "user/emp/empSelect";		
	}
	
	//모델에 객체 선언필요없이, 매개값에 넣으면 자동으로 만들어서 model 넘겨준다  spring에서 자동으로
	//단건조회
	@RequestMapping("/empSelect")
	public String empSelect(Model model, String id) {
		model.addAttribute("emp", empService.getEmp(id) );
		return "user/emp/emp";

	}
}
