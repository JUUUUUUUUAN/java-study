package sec01.homework.homework1;

public class Book implements Comparable<Book>{
	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() {}

	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	@Override
	public String toString() {
		return title + "(" + author + ")," + category + "," + price ;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getCategory() {
		return category;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.title);
	}
	
	
	
	
}
