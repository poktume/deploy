package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.emp.service.EmpService;
import com.example.demo.emp.service.EmpVO;

//@Controller
@RestController
public class EmpRestController {

	@Autowired
	EmpService empService;
	
	@GetMapping("emps")
	//@ResponseBody
	public List<EmpVO> allList() {
		return empService.getAllList();
	}
	
	@GetMapping("emps/{empId}")
	//@ResponseBody
	public EmpVO info(@PathVariable int empId) {
		return empService.getEmpInfo(empId);
	}
}
