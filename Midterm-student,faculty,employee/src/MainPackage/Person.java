package MainPackage;

public class Person {
	private String Name;
	private String Address;
	private String PhoneNbr;
	private String Email;

	public Person(String Name, String Address, String PhoneNbr, String Email) {
		this.Address = Address;
		this.Name = Name;
		this.PhoneNbr = PhoneNbr;
		this.Email = Email;

	}

	public void setName( String Address) {
		this.Address = Address;
	}

	public void setAddress( String Name) {
		this.Name = Name;
	}

	public void setPhoneNbr(String PhoneNbr) {
		this.PhoneNbr = PhoneNbr;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getAddress() {
		return Address;
	}

	public String getName() {
		return Name;
	}

	public String getPhoneNbr() {
		return PhoneNbr;
	}

	public String getEmail() {
		return Email;
	}

	
	public String toString() {

		return this.getClass().getName() + Name;

	}

}