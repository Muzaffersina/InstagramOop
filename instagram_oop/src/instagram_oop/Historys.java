package instagram_oop;

public class Historys {
	
	private String userImage;
	private String accountName;
	private String image;
	private String message;
	public Historys() {
		super();
	}
	public Historys(String userImage, String accountName, String image, String message) {
		super();
		this.userImage = userImage;
		this.accountName = accountName;
		this.image = image;
		this.message = message;
	}
	public String getUserImage() {
		return userImage;
	}
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
