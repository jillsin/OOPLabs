package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

	
    public Book(String title, String category, float cost) {
		super(new Random().nextInt(1_000_000) + 1, title, category, cost);
	}
    public void addAuthor(String authorName){
        if(!(authors.contains(authorName))){
            authors.add(authorName);
        }else {
            System.out.println("The author already exist.");
        }

    }
    public void removeAuthor(String authorName){

        if(authors.contains(authorName)){
            authors.remove(authorName);
        }else{
            System.out.println("Author is not existed");
        }
    }
    public List<String> getAuthors() {

		return authors;
	}

    
	@Override
	public String toString() {
		return "Book" + "-" + this.getTitle() + "-" + this.getCategory() + ": " + String.valueOf(this.getCost()) + "$";
	}
}

