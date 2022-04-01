package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

class Contacts {
	Scanner sc = new Scanner(System.in);
	ArrayList<Person> person;
	Contacts contacts = new Contacts();
	int no_of_Contacts;

	/**
	 * Adding new contacts to AddressBook
	 */
	public void newcontact() {
		for (int i = 0; i < no_of_Contacts; i++) {
			System.out.println("Enter First Name: ");
			String firstname = sc.nextLine();
			contacts.add(firstname);
			System.out.println("Enter last Name: ");
			String lastname = sc.nextLine();
			contacts.add(lastname);
			System.out.println("Enter Person address: ");
			String address = sc.nextLine();
			contacts.add(address);
			System.out.println("Enter Person City: ");
			String city = sc.nextLine();
			contacts.add(city);
			System.out.println("Enter Person state: ");
			String state = sc.nextLine();
			contacts.add(state);
			System.out.println("Enter zip code : ");
			String zip = sc.next();
			contacts.add(zip);
			System.out.println("Enter phone number: ");
			String phoneno = sc.nextLine();
			sc.nextLine();
			contacts.add(phoneno);
			System.out.println("Enter your Email Id: ");
			String email = sc.nextLine();
			contacts.add(email);
			Person person = new Person(firstname, lastname, address, city, state, zip, phoneno, email);

			System.out.println("The Contact Details of " + firstname + "\n" + person);
		}
	}

	private void add(String firstname) {
		// TODO Auto-generated method stub

	}

	public void editContact() {
		System.out.println("Enter name to Modify Data");
		String editinput = sc.next();
		for (int i = 0; i < person.size(); i++) {
			/**
			 * get contacts for whole array list
			 */
			Person pc1 = (Person) person.get(i);
			if (editinput.equals(pc1.getFirstName())) {
				/**
				 * calling add person to replace
				 */
				newcontact();
				for (int j = 0; j < person.size(); j++) {
					person.set(j, pc1);
				}

			} else {
				System.out.println("No matches found for given first name.");
			}
		}
	}
}

public class AddressBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Contacts contacts = new Contacts();
		System.out.println("Welcome to Address Book System Program");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			/**
			 * calling newcontact() method
			 */
			contacts.newcontact();
			break;
		case 2:
			/**
			 * calling editcontact() method
			 */
			contacts.editContact();
			break;
		}

	}

}
