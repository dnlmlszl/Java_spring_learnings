package com.lmdlearning.first_spring_boot_webapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class SayHelloController {
	
	@RequestMapping("/sayhello")
	@ResponseBody
	public String sayHello() {
		
		String message = "Hello! What are you learning today?";
		
		return String.format("%s", message);
	}
	
	@RequestMapping("/sayhello-html")
	@ResponseBody
	public String sayHelloHTML() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My first HTML page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>Hello!</h1>");		
		sb.append("<p>What are you learning today?</p>");	
		sb.append("</body<>");
		sb.append("</html>");
		
		
		return String.format("%s", sb);
	}
	
	@RequestMapping("/sayhello-jsp")
	public String sayHelloJsp() {	
		
		return "sayHello";
	}

}
