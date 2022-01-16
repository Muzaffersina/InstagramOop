package instagram_oop;

public class IndividualUser extends User {
	//bireysel musteriler icin zorunlu bilgiler.
	private String firstName;
	private String lastName;
	private String image;
	private String phoneNumber;	
	//private String myPostId;
	public IndividualUser() {
		super();
	}
	public IndividualUser(int id,String accountName, String email,String password, String firstName, String lastName, String image, String phoneNumber) {
		super(id, accountName, email, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.image = image;
		this.phoneNumber = phoneNumber;
	}	
	
	public String getFullName() {
		String fullName = (firstName+" "+lastName);
		return fullName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

}
