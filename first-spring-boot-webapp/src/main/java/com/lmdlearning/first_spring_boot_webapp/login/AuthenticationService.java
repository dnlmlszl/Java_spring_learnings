package com.lmdlearning.first_spring_boot_webapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUsername = username.equalsIgnoreCase("LMD79");
		boolean isValidPassword = password.equalsIgnoreCase("secret");
		
		
		
		return isValidUsername && isValidPassword;
	}

}
