package instagram_oop;

public class Post {
	//insta postlardaki bilgiler..
	private String postInfo;
	private String time;
	private int postId;
	private String postImage;
	private String senderAccountName;
	private String senderImage;
	
	public Post() {
		super();
	}

	public Post(String postInfo, String time, int postId, String postImage, String senderAccountName,
			String senderImage) {
		super();
		this.postInfo = postInfo;
		this.time = time;
		this.postId = postId;
		this.postImage = postImage;
		this.senderAccountName = senderAccountName;
		this.senderImage = senderImage;
	}

	public String getPostInfo() {
		return postInfo;
	}

	public void setPostInfo(String postInfo) {
		this.postInfo = postInfo;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getPostImage() {
		return postImage;
	}

	public void setPostImage(String postImage) {
		this.postImage = postImage;
	}

	public String getSenderAccountName() {
		return senderAccountName;
	}

	public void setSenderAccountName(String senderAccountName) {
		this.senderAccountName = senderAccountName;
	}

	public String getSenderImage() {
		return senderImage;
	}

	public void setSenderImage(String senderImage) {
		this.senderImage = senderImage;
	}
	
	

}
