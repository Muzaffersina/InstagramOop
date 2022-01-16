package instagram_oop;

public class CorporateUser extends User {
	private String companyName;
	private String accountNumber;
	private String image;
	private String phoneNumber;
	public CorporateUser() {
		super();
	}
	public CorporateUser(int id,String accountName, String email,String password,String companyName, String accountNumber, String image, String phoneNumber) {
		super(id, accountName, email, password);
		this.companyName = companyName;
		this.accountNumber = accountNumber;
		this.image = image;
		this.phoneNumber = phoneNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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
	

}
