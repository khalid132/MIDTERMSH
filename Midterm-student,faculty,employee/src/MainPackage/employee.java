package MainPackage;
import java.util.Date;

import MainPackage.Person;
public class employee extends Person {
	public employee(String Name, String Address, String PhoneNumber,
			String Email) {
		super(Name, Address, PhoneNumber, Email);
}
	private Date HiredDate = new java.util.Date();
	private String Salary;
	private String Office;

	public void setHiredDate(Date HiredDate) {
		this.HiredDate = HiredDate;
	}

	public void setOffice(String Office) {
		this.Office = Office;
	}

	public void setSalary(String Salary) {
		this.Salary = Salary;
	}

	public Date getHiredDate() {
		return HiredDate;
	}
	
	public String getOffice() {
		return Office;
	}

	public String getSalary() {
		return Salary;
	}

	public String toString() {
		return this.getClass().getName() + getName();
	}

	public String getName() {
	
		return null;
	}

}