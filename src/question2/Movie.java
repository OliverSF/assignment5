/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
package question2;

public class Movie {
	
	//creating 3 private instance variable
	private String title;
	private String genre;
	private int rating;
	
	//creating default constructor
	public Movie() {
		this.title = null;
		this.genre = null;
		this.rating = 0;
	}
	//Creating constructor
	public Movie(String title, String genre, int rating) {
		this.title = title;
		this.genre = genre;
		this.rating = rating;
	}
	//Creating getter for 'title'
	public String getTitle() {
		return title;
	}
	
	//creating setter for 'title'
	public void setTitle(String title) {
		this.title = title;
	}
	
	//Creating getter for 'genre'
	public String getGenre() {
		return genre;
	}
	
	//creating setter for 'genre'
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	//Creating getter for 'rating'
	public int getRating() {
		return rating;
	}
	
	//creating setter for 'rating'
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	//creating playIt method
	public void playIt(int i) {
		System.out.println(getTitle() + " - Now Playing");
	}

}//end class
