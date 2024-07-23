package com.lmdlearning.first_spring_boot_webapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class LoginController {
	
	//private Logger logger = LoggerFactory.getLogger(getClass());
	
	
	private AuthenticationService authenticationService;
	
	
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	// http://localhost:8080/login?name=LMD
	//@RequestMapping("/login")
	// public String login(@RequestParam String name, ModelMap model) {
		
		// model.put("name", name);
		
		// logger.debug("Request param is {}", name);
		// logger.warn("Print this message at warn level");
		// logger.info("Print this message at info level");
		
		//System.out.println("Request param is: " + name);
		// }
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String goToLoginPage() {
		
		return "login";
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
	}

}
