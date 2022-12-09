package com.company.app.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.app.emp.service.EmpService;
import com.company.app.emp.service.EmpVO;

@Controller //@Component �����̳ʿ� �� ���, ������ ȣ�� �� �� �ֵ��� Ŀ�ǵ�ȭ ������
public class EmployeeController {

	@Autowired EmpService empService;
	
	//��ü��ȸ
	@RequestMapping("empSelectAll")
	public String empSelectAll(Model model, EmpVO vo) {
		model.addAttribute("emps", empService.getEmpAll(vo)  );
		return "empSelect";		
	}
	
	//���������� �Ѱ��ٶ��� model ���.. �Ű������� ������ �ڵ������� �־��ش� spring��
}
