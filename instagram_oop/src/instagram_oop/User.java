package instagram_oop;

public class User {
	// iki hesap turu icinde zorunlu olan bilgiler.
	private int id;	
	private String accountName;
	private String email;
	private String password;
	public User() {
		super();
	}
	public User(int id, String accountName, String email, String password) {
		super();
		this.id = id;
		this.accountName = accountName;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
