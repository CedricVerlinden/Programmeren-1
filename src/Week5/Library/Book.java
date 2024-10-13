package Week5.Library;

public class Book {

	private String author;
	private String title;
	private int numberOfPages;
	private boolean borrowed;

	public Book() {
		this("Onbekend", "Onbekend", 0);
	}

	public Book(String author, String title, int numberOfPages) {
		this.author = author;
		this.title = title;
		this.numberOfPages = numberOfPages;
		this.borrowed = false;
	}

	public void printDetails() {
		System.out.println("Het boek " + title.toUpperCase() + " (" + numberOfPages + " " + (numberOfPages == 1 ? "pagina" : "pagina's") + "), geschreven door " + author.toUpperCase() + " is momenteel" + (borrowed ? "" : " niet") + " ontleend.");
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public boolean isBorrowed() {
		return borrowed;
	}

	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}
}
