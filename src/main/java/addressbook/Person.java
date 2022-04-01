package addressbook;

public class Person {
	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String phoneno;
	private String email;

	/**
	 * parameter constructor
	 * 
	 * @param firstname - first name of the person
	 * @param lastname  - Last name of the person
	 * @param address   - contact address of the person
	 * @param city      - city of the person belongs
	 * @param state     - state of the person belongs to.
	 * @param zip       - pincode
	 * @param phoneno   - contact number of the person
	 * @param email     - contact mail id of the person
	 */
	public Person(String firstname, String lastname, String address, String city, String state, int zip, String phoneno,
			String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneno = phoneno;
		this.email = email;
	}

	/**
	 * getter and setter methods for person contacts
	 * 
	 * @return
	 */
	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname; // this keyword is used to point the Current Object
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return zip;
	}

	public void setPincode(int zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneno;
	}

	public void setPhoneNumber(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getGmail() {
		return email;
	}

	public void setGmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return " FirstName :" + firstname + " LastName :" + lastname + " Address : " + address + " City : " + city
				+ " State : " + state + " Zip :" + zip + '\'' + " PhoneNumber : " + phoneno + " Email : " + email;

	}
}
