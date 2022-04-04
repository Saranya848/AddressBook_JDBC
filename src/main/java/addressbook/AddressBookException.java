package addressbook;

public class AddressBookException extends Exception {
	/**
	 * Default Serial Number
	 */
	private static final long serialVersionUID = 1L;
	public String message;

	public AddressBookException(String message) {
		super(message);
	}
}
