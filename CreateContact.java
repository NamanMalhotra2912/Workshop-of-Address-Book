package AddressBook.AddressBookSystemUsingThread;

import Address_Book.Create_Contact;

public class CreateContact {

	public String firstName = "Neeraj";
	public String lastName = "Malhotra";
	public String address = "Sector 4";
	public String city = "Gurgaon";
	public String state = "Haryana";
	public int zip = 122001;
	public long phoneNumber = 8588801333L;
	public String eMail = "neerajmalhotra0001@gmail.com";
	
	public void showContact() {
		
		System.out.println("Contact details are as follows :");
		System.out.println("First name : " + firstName);
		System.out.println("Last name : " + lastName);
		System.out.println("Address : " + address);
		System.out.println("City : " + city);
		System.out.println("State : " + state);
		System.out.println("Zip code : " + zip);
		System.out.println("Phone Number : " + phoneNumber);
		System.out.println("E-mail id : " + eMail);
		
	}
	
	public static void main(String[] args) {
		
		CreateContact createContact = new CreateContact();
		createContact.showContact();
		
	}

}
