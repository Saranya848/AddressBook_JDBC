package addressbook;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) throws AddressBookException {
		Contacts contacts = new Contacts();
		System.out.println("Welcome to Address Book System Program");

		System.out.println("Enter Choice for data : ");
		while (true) {
			System.out.println("Enter 1 To New Contact \n" + "Enter 2 To add New Contact \n"
					+ "Enter 3 To Find Contact \n" + "Enter 4 To Edit Contact \n" + "Enter 5 To Delete Contact \n"
					+ "Enter 6 To Display Contact \n" + "Enter 0 To Exit");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				/**
				 * Calling newContact() method for new contact
				 */
				contacts.newcontact();
				break;
			case 2:
				/**
				 * Calling addContact() method for Adding contact
				 */
				contacts.addContact();
				break;
			case 3:
				/**
				 * Calling findContacts() method for find data in Book
				 */
				contacts.findContacts();
				break;

			case 4:
				/**
				 * Calling editContact() method for updated data
				 */
				contacts.editContact();
				break;
			case 5:
				/**
				 * Calling deleteContact() method for deleting person's data
				 */
				contacts.deleteContact();
				break;
			case 6:
				/**
				 * Calling addMultipleContact() method for Multiple person's data
				 */
				contacts.addMultiplePerson();
				break;

			case 7:
				/**
				 * Calling displayContact() method for Display person's data
				 */
				contacts.display();
				break;
			}
			scanner.close();
		}
	}

	public char[] person;

	public void newcontact() {
		// TODO Auto-generated method stub

	}

	public void editPerson() {
		// TODO Auto-generated method stub

	}

	public void deletePerson() {
		// TODO Auto-generated method stub

	}

	public AddressBookMain get(String existingBook) {
		// TODO Auto-generated method stub
		return null;
	}

	public void duplicateCheck() {
		// TODO Auto-generated method stub

	}

}
