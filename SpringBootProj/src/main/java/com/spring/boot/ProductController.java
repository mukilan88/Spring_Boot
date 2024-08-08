package com.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;

	@PostMapping("/addProduct")
	public ModelAndView addProduct(@RequestParam(name = "pid") int pid, @RequestParam(name = "pname") String pname,
			@RequestParam(name = "price") int price) {
		Product prod = new Product(pid, pname, price);
		boolean flag = productService.addProduct(prod); // invoke Model/Service/Action Class
		if (flag) {
			return new ModelAndView("successProduct.jsp"); // invoke View
		} else {
			return new ModelAndView("failureProduct.jsp"); // invoke View
		}
	}
}
