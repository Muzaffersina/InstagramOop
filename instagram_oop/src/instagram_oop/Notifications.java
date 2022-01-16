package instagram_oop;

public class Notifications {
	private String info;
	private String image;
	private String time;
	private String infoImage;
	public Notifications() {
		super();
	}
	public Notifications(String info, String image, String time, String infoImage) {
		super();
		this.info = info;
		this.image = image;
		this.time = time;
		this.infoImage = infoImage;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getInfoImage() {
		return infoImage;
	}
	public void setInfoImage(String infoImage) {
		this.infoImage = infoImage;
	}
	
	
	

}
