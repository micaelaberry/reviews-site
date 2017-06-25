package review_package;

public class TacoReview {

	private long id; // should be long
	private String title;
	private String taste;
	private String imageURL;
	public String description;

	public long getId() { // id
		return id;
	}

	public String getTitle() { // name of the taco place
		return title;
	}

	public String getImageURL() { // get taco pic
		return imageURL;
	}

	public String getTaste() { // taste level of food
		return taste;
	}

	public String getDescription() { // get taco review
		return description;
	}

	public TacoReview(long id, String title, String imageURL, String taste, String description) {
		this.id = id;
		this.title = title;
		this.imageURL = imageURL;
		this.taste = taste;
		this.description = description;

	}

}