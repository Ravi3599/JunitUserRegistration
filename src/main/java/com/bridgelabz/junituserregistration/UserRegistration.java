package com.bridgelabz.junituserregistration;

import java.util.regex.*;

public class UserRegistration {
		private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
		static boolean isFirstNameValid;
		
		public boolean validateFirstName(String firstName) {
			isFirstNameValid= Pattern.matches(FIRST_NAME_REGEX,firstName);
			if(!isFirstNameValid) {
				System.out.println("First Name is invalid...Please enter proper first name");
				System.exit(0);
			}
			return Pattern.matches(FIRST_NAME_REGEX,firstName);
		}
}