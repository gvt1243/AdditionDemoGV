package com.example.demo.Controllers;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.AdditionService.AddService;
import com.example.demo.Entities.Addition;

import antlr.collections.List;

@Controller
public class AddController {
	
	@Autowired
	private RestTemplate resttemp ;
	
	@Autowired
	AddService serviceObj;
	@GetMapping("/index")
	public String viewForm()
	{
		return "index";
		
	}
	@PostMapping("/addtion")
	public String addForm(@ModelAttribute Addition addObj, Model model)
	{
		
		int c = serviceObj.getTotal(addObj);
		System.out.println("total"+ c);
		ModelAndView mod = new ModelAndView();
		model.addAttribute("sum",c);
		return "calculate";
		
	}
	
	//Rest templatre to fetch prodcuts
	@GetMapping("/ProductApi")
			public List getProducts()
			{
				String url="http://localhost:8081/products/";
				Object obj[] = resttemp.getForObject(url, Object[].class);
				return (List) Arrays.asList(obj);
			}
	
	
}
