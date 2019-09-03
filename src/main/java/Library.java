import java.util.ArrayList;

public class Library {


    private String name;
    private ArrayList<Book> collection;
    private int capacity;

    public Library(String name, int capacity) {
        this.name = name;
        this.collection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public String getName(){
        return this.name;
    }

    public int collectionSize(){
        return this.collection.size();
    }

    public int collectionCount() {
        return this.collection.size();
    }

    public void add(Book book) {
        this.collection.add(book);
    }

    public int getCapacity(){
        return this.capacity;
    }

    public boolean verifyCapacity() {
        if (this.collectionCount() < this.capacity) {
            return true;
        } else {
            return false;
        }
    }


}
