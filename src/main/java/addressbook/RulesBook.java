package addressbook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RulesBook {
	public String input;

	/**
	 * [1] 1. We are passing the first name to this method and we define the regex
	 * pattern 2. First name starts with Cap and has minimum 3 characters 3. We have
	 * used the compile method of the pattern class to create the object for the
	 * pattern 4. Then we use the Matcher class to interpret the pattern object & it
	 * checks the string passed if it matches the pattern 5. Then we are using the
	 * matches() method to check if it matches or not.
	 * 
	 * @param firstName - we pass the first name of the user to check
	 * @return
	 */
	public boolean firstName(String firstname) throws AddressBookException {
		input = "([A-Z][a-z]{1,})";
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(firstname);
		if (m.matches() == true) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Sorry!! InValid Input");
			System.out.println("Try valid Input");
		}
		return m.matches();
	}

	/**
	 * [2] 1. We are passing the first name to this method and we define the regex
	 * pattern 2. First name starts with Cap and has minimum 3 characters 3. We have
	 * used the compile method of the pattern class to create the object for the
	 * pattern 4. Then we use the Matcher class to interpret the pattern object & it
	 * checks the string passed if it matches the pattern 5. Then we are using the
	 * matches() method to check if it matches or not.
	 * 
	 * @param lastName - we pass the last name of the user to check
	 * @return
	 */
	public boolean lastName(String lastname) throws AddressBookException {
		input = "([A-Z]{1}[a-z]{2,})";

		// Pattern p = Pattern.complie("((?=.*\\d).{8,20})");
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(lastname);
		if (m.matches() == true) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Sorry!! InValid Input");
			System.out.println("Try valid Input");
		}
		return m.matches();
	}

	/**
	 * [3] 1. We are passing the Address to this method and we define the regex
	 * pattern 2. First name starts with Cap and has minimum 3 characters 3. We have
	 * used the compile method of the pattern class to create the object for the
	 * pattern 4. Then we use the Matcher class to interpret the pattern object & it
	 * checks the string passed if it matches the pattern 5. Then we are using the
	 * matches() method to check if it matches or not.
	 * 
	 * @param address - we pass the address of the user to check
	 * @return
	 */
	public boolean address(String address) throws AddressBookException {
		input = "^[#.0-9a-zA-Z\\s,-]+$";

		// Pattern p = Pattern.complie("((?=.*\\d).{8,20})");
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(address);
		if (m.matches() == true) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Sorry!! InValid Input");
			System.out.println("Try valid Input");
			// p.matcher(address);
		}
		return m.matches();
	}

	/**
	 * [4] 1. We are passing the Address to this method and we define the regex
	 * pattern 2. First name starts with Cap and has minimum 3 characters 3. We have
	 * used the compile method of the pattern class to create the object for the
	 * pattern 4. Then we use the Matcher class to interpret the pattern object & it
	 * checks the string passed if it matches the pattern 5. Then we are using the
	 * matches() method to check if it matches or not.
	 * 
	 * @param city - we pass the city of the user to check
	 * @return
	 */
	public boolean city(String city) throws AddressBookException {
		input = "([A-Z]{1}[a-z]{2,})";

		// Pattern p = Pattern.complie("((?=.*\\d).{8,20})");
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(city);
		if (m.matches() == true) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Sorry!! InValid Input");
			System.out.println("Try valid Input");
		}
		return m.matches();
	}

	/**
	 * [5] 1. We are passing the state to this method and we define the regex
	 * pattern 2. First name starts with Cap and has minimum 3 characters 3. We have
	 * used the compile method of the pattern class to create the object for the
	 * pattern 4. Then we use the Matcher class to interpret the pattern object & it
	 * checks the string passed if it matches the pattern 5. Then we are using the
	 * matches() method to check if it matches or not.
	 * 
	 * @param state - we pass the state of the user to check
	 * @return
	 */
	public boolean state(String state) throws AddressBookException {
		input = "([A-Z]{1}[a-z]{2,})";

		// Pattern p = Pattern.complie("((?=.*\\d).{8,20})");
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(state);
		if (m.matches() == true) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Sorry!! InValid Input");
			System.out.println("Try valid Input");
		}
		return m.matches();
	}

	/**
	 * [6] city code follow by space and 6 digit number
	 * 
	 * @param zip - user input of zip
	 * @return
	 */
	public boolean zip(String zip) throws AddressBookException {
		input = "^[1-9]{1}[0-9]{5}$";

		// Pattern p = Pattern.complie("((?=.*\\d).{8,20})");
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(zip);
		if (m.matches() == true) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Sorry!! InValid Input");
			System.out.println("Try valid Input");
		}
		return m.matches();
	}

	/**
	 * [7] Country code follow by space and 10 digit number
	 * 
	 * @param phoneno - user input of phone number
	 * @return
	 */
	public boolean phoneno(String phoneno) throws AddressBookException {
		// input = "^(0/91)?[7-9]{1}[0-9]{9}$";
		input = "^\\+(?:[0-9] ?){6,14}[0-9]$";
		// Pattern p = Pattern.complie("((?=.*\\d).{8,20})");
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(phoneno);
		if (m.matches() == true) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Sorry!! InValid Input");
			System.out.println("Try valid Input");
		}
		return m.matches();
	}

	/**
	 * [8] 1. We are passing the first name to this method and we define the regex
	 * pattern 2. Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz &
	 * in) with precise @ and . positions
	 * 
	 * @param email - we pass the email id to check the regex
	 * @return
	 */
	public boolean email(String email) throws AddressBookException {
		input = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}$";

		// Pattern p = Pattern.complie("((?=.*\\d).{8,20})");
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(email);
		if (m.matches() == true) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Sorry!! InValid Input");
			System.out.println("Try valid Input");
		}
		return m.matches();
	}

	/**
	 * Array defines the valid email.
	 */
	static String[] validEmails = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
			"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" };

	/**
	 * Array defines the invalid email.
	 */
	static String[] nonValidEmails = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
			".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
			"abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };

	/**
	 * In this method we passing the email to the regex pattern to check if it is
	 * valid. We are using a for loop to go through all the email
	 */
	public void testForValidEmails() throws AddressBookException {
		System.out.println("Valid Emails\n");
		for (int i = 0; i < validEmails.length; i++) {
			String regex = "^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(validEmails[i]);
			if (matcher.matches()) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
		System.out.println(" ");
	}

	/**
	 * In this method we passing the email to the regex pattern to check if it is
	 * not valid. We are using a for loop to go through all the email
	 */
	public void testForNonValidEmails() throws AddressBookException {
		System.out.println("Non Valid Emails\n");
		for (int i = 0; i < nonValidEmails.length; i++) {
			String regex = "^[a-zA-Z-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(nonValidEmails[i]);
			if (matcher.matches()) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}
}
