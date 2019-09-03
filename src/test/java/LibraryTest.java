import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;



    @Before
    public void setUp() {
        library = new Library("Central", 4);
        book = new Book("","", "");
    }

    @Test
    public void hasName(){
        assertEquals("Central", library.getName());
    }

    @Test
    public void startsWithEmptyCollection(){
        assertEquals(0, library.collectionCount());
    }

    @Test
    public void canAddToCollection() {
        library.add(book);
        assertEquals( 1, library.collectionSize());
    }

    @Test
    public void hasCapacity(){
        assertEquals(4,library.getCapacity());
    }

    @Test
    public void canVerifyCapacity(){
        library.add(book);
        assertEquals(1, library.collectionCount());

    }
}
