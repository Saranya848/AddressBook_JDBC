package addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contacts {

	ArrayList<Person> person;
	MultipleAddressBook multipleAddressBook = new MultipleAddressBook();
	Map<String, AddressBookMain> addressbook = new HashMap<String, AddressBookMain>();
	// public Contacts() {
	// person = new ArrayList<Person>();
	// }

	Scanner sc = new Scanner(System.in);

	ArrayList<String> contacts = new ArrayList<String>();
	RulesBook rules = new RulesBook();
	// Contacts contacts = new Contacts();
	int i;
	int no_of_Contacts = sc.nextInt();

	/**
	 * Added Contact to AddressBook
	 * 
	 * @throws AddressBookException
	 */
	public void addContact() throws AddressBookException {

		for (i = 0; i < no_of_Contacts; i++) {

			System.out.println("Enter the contact details of person ");
			newcontact();
		}
	}

	/**
	 * Creating new contacts to AddressBook
	 * 
	 * @param no_of_Contacts : Number Of person's Data
	 * 
	 * @throws AddressBookException
	 */
	public void newcontact() throws AddressBookException {

		for (i = 0; i < no_of_Contacts; i++) {
			System.out.println("Enter First Name: ");
			String firstname = sc.nextLine();
			sc.nextLine();
			rules.firstName(firstname);

			System.out.println("Enter last Name: ");
			String lastname = sc.nextLine();
			rules.lastName(lastname);

			System.out.println("Enter Person address: ");
			String address = sc.nextLine();
			rules.address(address);

			System.out.println("Enter Person City: ");
			String city = sc.nextLine();
			rules.city(city);

			System.out.println("Enter Person state: ");
			String state = sc.nextLine();
			rules.state(state);

			System.out.println("Enter zip code : ");
			String zip = sc.next();
			contacts.add(zip);
			rules.zip(zip);

			System.out.println("Enter phone number: ");
			String phoneno = sc.nextLine();
			sc.nextLine();
			rules.phoneno(phoneno);

			System.out.println("Enter your Email Id: ");
			String email = sc.nextLine();
			rules.email(email);

			Person person = new Person(firstname, lastname, address, city, state, zip, phoneno, email);

			System.out.println("\n The Contact Details of " + firstname + "\n" + person);
		}
	}

	/**
	 * Finding Duplicate Contacts
	 * 
	 * @return
	 */
	public Person findContacts() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the first name of the contact to modify: ");
		String fname = sc.next();
		int duplicate = 0; // will increment the duplicate if found multiple contacts with same name
		Person temp = null;
		for (Person person : person) {
			if (person.getFirstName().equals(fname)) {
				duplicate++;
				temp = person;
			}
		}
		if (duplicate == 1) {
			return temp;

		} else if (duplicate > 1) {
			System.out.print(" There are multiple contacts with given name. \n Please enter their Phone No: ");
			String PhoneNum = sc.next();
			for (Person person : person) {
				if (person.getFirstName().equals(fname) && person.getPhoneNumber().equals(PhoneNum)) {
					return person;
				}
			}
		} else {
			System.out.println("No contact with the given first name. Please enter the correct first name");
			findContacts();
		}
		return temp;
	}

	/**
	 * Method to edit contact in specific Address Book Took user input to search
	 * through HashMap If found: calling editPerson Method
	 */
	public void duplicateContacts() {
		System.out.println("Enter name of address book you want to edit contact in");
		String existingBook = sc.next();
		AddressBookMain addressBook = addressbook.get(existingBook);
		if (addressBook == null) {
			System.out.println("No adress book exists with given name");
		} else {
			addressBook.get(existingBook).duplicateCheck();
		}
	}

	/**
	 * editcontact for Editing/Modify the data
	 * 
	 * @throws AddressBookException
	 */
	public void editContact() throws AddressBookException {
		System.out.println("Enter name to Modify Data");
		String editinput = sc.next();
		for (int i = 0; i < no_of_Contacts; i++) {
			/**
			 * get contacts for whole array list
			 */
			Person pc1 = (Person) person.get(i);
			if (editinput.equals(pc1.getFirstName())) {
				/**
				 * calling add person to replace
				 */
				newcontact();
				for (int j = 0; j < no_of_Contacts; j++) {
					person.set(j, pc1);
				}

			} else {
				System.out.println("No matches found for given first name.");
			}
		}
	}

	/**
	 * Deleting person data
	 */
	public void deleteContact() throws AddressBookException {
		System.out.println("Enter firstName of the person");
		String editName = sc.nextLine();
		Person pc1 = (Person) person.get(i);
		if (editName.equals(pc1.getFirstName())) {
			System.out.println("Deleted " + pc1.getFirstName() + " details");
			person = null;
		}
	}

	public void addMultiplePerson() {
		while (true) {
			System.out.println("Enter the option \n" + "1)To Add New Address Book\n" + "2)To Add New Contact\n"
					+ "3)To Edit Contact" + "\n4)To Delete Contact" + "\n5)To Print Address Books\n6)Exit");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				multipleAddressBook.addressBookAddition();
				break;
			case 2:
				multipleAddressBook.addingContacts();
				break;
			case 3:
				multipleAddressBook.editingContacts();
				break;
			case 4:
				multipleAddressBook.deletingContacts();
				break;
			case 5:
				multipleAddressBook.duplicateContacts();
				break;
			case 6:
				multipleAddressBook.searchcrs();
				break;
			case 7:
				multipleAddressBook.printAddressBook();
				break;
			case 8: {
				System.out.println("You are out of the address book system");
			}

				break;
			default:
				System.out.println("invalid option");

				break;
			}
		}
	}

	/**
	 * Display Person Data
	 */
	public void display() {
		for (Person person : person)

			System.out.println("Person details " + person.getFirstName() + "\t" + person.getLastName() + "\t"
					+ person.getAddress() + "\t" + person.getCity() + "\t" + person.getState() + "\t"
					+ person.getPincode() + "\t" + person.getPhoneNumber() + "\t" + person.getGmail());

	}
}
