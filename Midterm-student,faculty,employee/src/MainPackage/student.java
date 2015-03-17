package MainPackage;

public class student extends employee {
	
	private String Title;

	public student(String Name, String Address, String PhoneNumber, String Email) {
		super(Name, Address, PhoneNumber, Email);
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String Title) {
		this.Title = Title;
	}

	
	public String toString() {
		return this.getClass().getName() + getName();
	}
	

}