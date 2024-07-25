package com.lmdlearning.first_spring_boot_webapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class WelcomeController {	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String goToWelcomePage(ModelMap model) {
		
		model.put("username", getLoggedInUsername());		
		
		return "welcome";
	}
	
	private String getLoggedInUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		
		return authentication.getName();
	}
	
	/*
	 private Logger logger = LoggerFactory.getLogger(getClass());
	
	
	private AuthenticationService authenticationService;
	
	
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}
	  
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String goToWelcomePage(@RequestParam String username, @RequestParam String password, ModelMap model) {
		
		
		// Authentication hard coded
		
		if (authenticationService.authenticate(username, password)) {
			model.put("username", username);
			model.put("password", password);
			
			return "welcome";
		}
		
		model.put("errorMessage", "Invalid credentials! Please, try again.");
		return "login";
	}*/

}
