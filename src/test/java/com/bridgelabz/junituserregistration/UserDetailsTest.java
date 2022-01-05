package com.bridgelabz.junituserregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserDetailsTest {
	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateFirstName("Ravi");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateFirstName("ravi");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateFirstName("ra");
		Assert.assertFalse(isValid);
	}
	
}
