package instagram_oop;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CreatePost  {
	private String senderId;
	private String image;
	private String info;
	public CreatePost() {
		super();
	}
	public CreatePost(String senderId, String image, String info) {
		super();
		this.senderId = senderId;
		this.image = image;
		this.info = info;
	}
	public String getSenderId() {
		return senderId;
	}
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	public LocalDateTime getDateTime() {
		// gecerli tarih ve saat bilgisi otomatik olusturulmasi
		LocalDateTime LocalTime = LocalDateTime.now();
		return LocalTime;
	}
	
	

}
