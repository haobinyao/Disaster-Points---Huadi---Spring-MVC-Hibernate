package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.dao.DpDAO;
import com.luv2code.springdemo.entity.Dp;
import com.luv2code.springdemo.service.DpService;

@Controller
@RequestMapping("/dp")
public class DpController {
	
	@Autowired
	private DpService dpService;

	@GetMapping("/list")
	public String listDps(Model theModel) {
		// get Dps from the service
		List<Dp> theDps = dpService.getDps();
		
		// add the Dps to the model
		theModel.addAttribute("dps", theDps);
		
		return "list-dps";
	}
	
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Dp theDp = new Dp();
		
		theModel.addAttribute("dp", theDp);
		
		return "dp-form";
	}
	
	@PostMapping("/saveDp")
	public String saveDp(@ModelAttribute("dp") Dp theDp) {
		
		// save the dp using our service
		dpService.saveDp(theDp);
		
		
		return "redirect:/dp/list";
	}
	
	@GetMapping("/showFormForUpdate") 
	public String showFormForUpdate(@RequestParam("dpId") int theId, Model theModel) {
		
		// get the dp from our dpService
		Dp theDp = dpService.getDp(theId);
		
		// set dp as a model attribute to pre-populate the form
		theModel.addAttribute("dp", theDp);
		
		// send over to our form
		return "dp-form";
	}
	
	@GetMapping("/delete")
	public String deleteDp(@RequestParam("dpId") int theId) {
		// delete dp
		dpService.deleteDp(theId);
		
		return "redirect:/dp/list";
	}
}





// 5. create customerController

//// need to inject the customer dao
//@Autowired
//private DpDAO dpDAO;

//@GetMapping("/list")
//public String listDps(Model theModel) {
//	// get Dps from the dao
//	List<Dp> theDps = dpDAO.getDps();
//	
//	// add the Dps to the model
//	theModel.addAttribute("dps", theDps);
//	
//	return "list-dps";
//}

// need to inject the customer service
