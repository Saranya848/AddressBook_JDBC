package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

class Contacts {
	ArrayList<Person> person;
	Scanner sc = new Scanner(System.in);

	/**
	 * Adding new contacts to AddressBook
	 */
	public void newcontact() {

		System.out.println("Enter First Name: ");
		String firstname = sc.nextLine();

		System.out.println("Enter last Name: ");
		String lastname = sc.nextLine();

		System.out.println("Enter Person address: ");
		String address = sc.nextLine();

		System.out.println("Enter Person City: ");
		String city = sc.nextLine();

		System.out.println("Enter Person state: ");
		String state = sc.nextLine();

		System.out.println("Enter zip code : ");
		int zip = sc.nextInt();

		System.out.println("Enter phone number: ");
		String phoneno = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter your Email Id: ");
		String email = sc.nextLine();
		Person person = new Person(firstname, lastname, address, city, state, zip, phoneno, email);

		System.out.println("The Contact Details of " + firstname + "\n" + person);
	}
}

public class AddressBook {
	public static void main(String[] args) {
		Contacts contacts = new Contacts();
		System.out.println("Welcome to Address Book System Program");
		/**
		 * calling newcontact() method
		 */
		contacts.newcontact();
	}
}
