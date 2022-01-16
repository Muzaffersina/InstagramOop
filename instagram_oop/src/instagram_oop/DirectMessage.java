package instagram_oop;

public class DirectMessage {
	private String senderImage;
	private String senderFullName;
	private String messageInfo;
	private String messageTime;
	private String myaccountName;
	
	public DirectMessage() {
		super();
	}
	public DirectMessage(String senderImage, String senderFullName, String messageInfo, String messageTime,
			String myaccountName) {
		super();
		this.senderImage = senderImage;
		this.senderFullName = senderFullName;
		this.messageInfo = messageInfo;
		this.messageTime = messageTime;
		this.myaccountName = myaccountName;
	}
	public String getSenderImage() {
		return senderImage;
	}
	public void setSenderImage(String senderImage) {
		this.senderImage = senderImage;
	}
	public String getSenderFullName() {
		return senderFullName;
	}
	public void setSenderFullName(String senderFullName) {
		this.senderFullName = senderFullName;
	}
	public String getMessageInfo() {
		return messageInfo;
	}
	public void setMessageInfo(String messageInfo) {
		this.messageInfo = messageInfo;
	}
	public String getMessageTime() {
		return messageTime;
	}
	public void setMessageTime(String messageTime) {
		this.messageTime = messageTime;
	}
	public String getMyaccountName() {
		return myaccountName;
	}
	public void setMyaccountName(String myaccountName) {
		this.myaccountName = myaccountName;
	}
	
	

}
