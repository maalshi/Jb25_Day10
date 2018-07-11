import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class BookCollection {
	
	List<Book> lib = new ArrayList<Book>();
	Book name;
	Book author;
	
	public BookCollection(){
		
	}
	
	public BookCollection(List<Book> lib) {
		super();
		this.lib = lib;
	}
	
	public List<Book> getLib() {
		return lib;
	}

	public void setLib(List<Book> lib) {
		this.lib = lib;
	}
	
	public void addBook(Book book){
		lib.add(book);
	}
	
	public void removeBook(Book book){
		lib.remove(book);
	}
	
	public void findBook(String content){
		for (Book aLib : lib) {
			if(aLib.getName().equals(content) || (aLib.getAuthor().equals(content)) )
			System.out.println(aLib.getName() + " " + aLib.getAuthor());
		}
	}
	
	
	public void showList(){
		Iterator<Book> iterator = lib.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next() + " ");
		}
	}
	
	public  void showTable(){
        for (Book aLib : lib) {
            System.out.println("|" + aLib.getName() + "|" + aLib.getAuthor() + "|");
           
        }
        
    
	}

}
