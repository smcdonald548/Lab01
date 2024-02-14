package tests;

import model.Account;
import utils.TestUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AccountTest {
	
	public static void testConstructor() {
		String test_account_number = "scott";
		String test_username_of_bank_holder = "email@qub.ac.uk";
		String test_account_type = "Standard";
		Date test_account_opening_date = new Date("20/08/2019");
		
		
		Account testAccount = new Account(test_account_number, test_username_of_bank_holder, test_account_type, test_account_opening_date);
		
		
		System.out.println("Starting the assertions of the test method: testUserConstructor");
		
		
		
		if(testAccount.getAccount_number() == test_account_number)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TCI-getAccount_number-Passed"+ TestUtils.TEXT_COLOR_RESET);
		else
			System.out.println(TestUtils.TEXT_COLOR_RED + "TCI-getAccount_number-FAILED"+ TestUtils.TEXT_COLOR_RESET);
		
		if(testAccount.getUsername_of_account_holder() == test_username_of_bank_holder)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TCI-getUsername_of_account_holder-Passed"+ TestUtils.TEXT_COLOR_RESET);
		else
			System.out.println(TestUtils.TEXT_COLOR_RED + "TCI-getUsername_of_account_holder-FAILED"+ TestUtils.TEXT_COLOR_RESET);
		
		if(testAccount.getAccount_type() == test_account_type)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TCI-getAccount_type-Passed"+ TestUtils.TEXT_COLOR_RESET);
		else
			System.out.println(TestUtils.TEXT_COLOR_RED + "TCI-getAccount_type-FAILED"+ TestUtils.TEXT_COLOR_RESET);
		
		if(testAccount.getAccount_opening_date() == test_account_opening_date)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TCI-getAccount_opening_date-Passed"+ TestUtils.TEXT_COLOR_RESET);
		else
			System.out.println(TestUtils.TEXT_COLOR_RED + "TCI-getAccount_opening_date-FAILED"+ TestUtils.TEXT_COLOR_RESET);
	}
	
	public static void testSetters() {
		System.out.println();
		System.out.println("Test Setters");
		String test_account_number = "scott";
		String test_username_of_bank_holder = "email@qub.ac.uk";
		String test_account_type = "Standard";
		Date test_account_opening_date = new Date("20/08/2019");
		
		Account testAccount = new Account(null, null, null, null);
		testAccount.setAccount_number(test_account_number);
		testAccount.setAccount_opening_date(test_account_opening_date);
		testAccount.setAccount_type(test_account_type);
		testAccount.setUsername_of_account_holder(test_username_of_bank_holder);
		
		
		if(testAccount.getAccount_number() == test_account_number)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TCI-getAccount_number-Passed"+ TestUtils.TEXT_COLOR_RESET);
		else
			System.out.println(TestUtils.TEXT_COLOR_RED + "TCI-getAccount_number-FAILED"+ TestUtils.TEXT_COLOR_RESET);
		
		if(testAccount.getUsername_of_account_holder() == test_username_of_bank_holder)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TCI-getUsername_of_account_holder-Passed"+ TestUtils.TEXT_COLOR_RESET);
		else
			System.out.println(TestUtils.TEXT_COLOR_RED + "TCI-getUsername_of_account_holder-FAILED"+ TestUtils.TEXT_COLOR_RESET);
		
		if(testAccount.getAccount_type() == test_account_type)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TCI-getAccount_type-Passed"+ TestUtils.TEXT_COLOR_RESET);
		else
			System.out.println(TestUtils.TEXT_COLOR_RED + "TCI-getAccount_type-FAILED"+ TestUtils.TEXT_COLOR_RESET);
		
		if(testAccount.getAccount_opening_date() == test_account_opening_date)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TCI-getAccount_opening_date-Passed"+ TestUtils.TEXT_COLOR_RESET);
		else
			System.out.println(TestUtils.TEXT_COLOR_RED + "TCI-getAccount_opening_date-FAILED"+ TestUtils.TEXT_COLOR_RESET);
	}
	
	
	public static void main(String[] args) {
		testConstructor();
		testSetters();
		
		

	}
}
