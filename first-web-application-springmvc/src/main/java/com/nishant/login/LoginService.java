package com.nishant.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean isValidUser(String name, String password) {
		if (name.equals("Nishant") && password.equals("password")) {
			return true;
		}
		return false;
	}

}
