package com.bridgelabz.junituserregistration;

import java.util.regex.*;

public class UserRegistration {
		private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
		private static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}$";
		static boolean isFirstNameValid,isLastNameValid;
		
		public boolean validateFirstName(String firstName) {
			isFirstNameValid= Pattern.matches(FIRST_NAME_REGEX,firstName);
			if(!isFirstNameValid) {
				System.out.println("First Name is invalid...Please enter proper first name");
			}
			return Pattern.matches(FIRST_NAME_REGEX,firstName);
		}
		public boolean validateLastName(String lastName) {
			isLastNameValid= Pattern.matches(LAST_NAME_REGEX, lastName);
			if(!isLastNameValid) {
				System.out.println("Last Name is invalid...Please enter proper last name");
			}
			return Pattern.matches(LAST_NAME_REGEX, lastName);
		}
}