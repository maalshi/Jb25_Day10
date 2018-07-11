import java.util.List;


public class Book {
	
	@Override
	public String toString() {
		return "Book: name=" + name + ", author=" + author;
	}
	

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	private String name;
	private String author;
	
	

}
