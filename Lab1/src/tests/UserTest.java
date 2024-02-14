package tests;

import model.User;
import utils.TestUtils;

public class UserTest {

	public static void testUserConstructor() {
		String test_username = "mike";
		String test_password = "my_password";
		String test_first_name = "Mike";
		String test_last_name = "Smith";
		String test_mobile_number = "07771234567";
		
		
		User testUser = new User(test_username, test_password, test_first_name, test_last_name, test_mobile_number);
		
		System.out.println("Starting the assertions of the test method: testUserConstructor");
		
		if(testUser.getUsername() == test_username)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TCI-getUsername-Passed"+ TestUtils.TEXT_COLOR_RESET);
		else
			System.out.println(TestUtils.TEXT_COLOR_RED + "TCI-getUsername-FAILED"+ TestUtils.TEXT_COLOR_RESET);
		
		if(testUser.getPassword() == test_password)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TCI-getPassword-Passed"+ TestUtils.TEXT_COLOR_RESET);
		else
			System.out.println(TestUtils.TEXT_COLOR_RED + "TCI-getPassword-FAILED"+ TestUtils.TEXT_COLOR_RESET);
	}
	
	public static void main(String[] args) {
		testUserConstructor();
		

	}

}
