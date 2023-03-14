package com.dat.CateringService.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeeklyInvoiceController {
	
	@GetMapping("/weekly-invoice")
	public String weeklyInvoice(Model theModel) {
		return "weekly-invoice";
	}
	
	@GetMapping("/saveInvoice")
	public String createInvoice(@RequestParam("action") String action) {
		if (action.equals("close")) {
		    // handle form submission for path1
		    return "redirect:/weekly-invoice";
		  } else if (action.equals("save")) {
		    // handle form submission for path2
		    return "";
		  } else {
		    // handle invalid action value
		    return "error";
		  }
		
	}

}
