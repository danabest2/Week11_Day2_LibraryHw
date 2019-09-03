import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> collection;

    public Library(String name) {
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public int collectionSize(){
        return this.collection.size();
    }

    public void add(Book book) {
        this.collection.add(book);
    }
}
