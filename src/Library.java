import java.util.ArrayList;
import java.util.List;


public class Library {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BookCollection library = new BookCollection();
		library.addBook(new Book("Consuelo", "Sand"));
		library.addBook(new Book("Angelica","Golon"));
		library.addBook(new Book("Monte Christo", "Duma"));
	
		library.removeBook(new Book("Consuelo", "Sand"));
		library.showList();
		library.showTable();
		library.findBook("Golon");
	
	}

}
