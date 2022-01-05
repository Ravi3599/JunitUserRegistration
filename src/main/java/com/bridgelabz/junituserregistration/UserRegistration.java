package com.bridgelabz.junituserregistration;

import java.util.regex.*;

public class UserRegistration {
		private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
		private static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}$";
		private static final String EMAIL_REGEX = "^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		static boolean isFirstNameValid,isLastNameValid,isMailValid;
		
		public boolean validateFirstName(String firstName) {
			isFirstNameValid= Pattern.matches(FIRST_NAME_REGEX,firstName);
			if(!isFirstNameValid) {
				System.out.println("First Name is invalid...Please enter proper first name");
				System.exit(0);
			}
			return Pattern.matches(FIRST_NAME_REGEX,firstName);
		}
		public boolean validateLastName(String lastName) {
			isLastNameValid= Pattern.matches(LAST_NAME_REGEX, lastName);
			if(!isLastNameValid) {
				System.out.println("Last Name is invalid...Please enter proper last name");
				System.exit(0);
			}
			return Pattern.matches(LAST_NAME_REGEX, lastName);
		}
		public boolean validateEmail(String mail) {
			isMailValid= Pattern.matches(EMAIL_REGEX, mail);
			if(!isMailValid) {
				System.out.println("E-mail is invalid...Please enter e-mail");
				System.exit(0);
			}
			return Pattern.matches(EMAIL_REGEX, mail);
		}

}