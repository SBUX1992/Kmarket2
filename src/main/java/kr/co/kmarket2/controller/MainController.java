package kr.co.kmarket2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.kmarket2.repository.MemberRepo;
import kr.co.kmarket2.service.ProductService;
import kr.co.kmarket2.vo.ProductVO;

@Controller
public class MainController {
	
	@Autowired
	ProductService service;
	@Autowired
	private MemberRepo repo;
	
	
	@GetMapping(value = {"/", "index"})
    public String index(Model model){

        return "index";
    }
	
	
	
	
	
	
	
}
