/*
날짜 : 2023/02/08~
이름 : 김동근
내용 : Kmarket2 SpringBoot product controller
*/
package kr.co.kmarket2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.kmarket2.service.ProductService;
import kr.co.kmarket2.vo.ProductVO;

@Controller
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("product/list")
	public String list(Model model) {
		List<ProductVO> products = service.selectProductsByCate("10", "10", "sold", 0);
		model.addAttribute("products", products);
		
		return "product/list";
	}
	
	@GetMapping("product/view")
	public String view(Model model, String prodNo) {
		
		return "product/view";
	}
	
	@GetMapping("product/complete")
	public String complete() {
		
		return "product/complete";
	}
	
	@GetMapping("product/cart")
	public String cart() {
		
		return "product/cart";
	}
	
	@GetMapping("product/order")
	public String order() {
		
		return "product/order";
	}
}
 