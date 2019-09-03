import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void setUp() {
        library = new Library("Central");
        book = new Book("","", "");
    }

    @Test
    public void canAddToCollection() {
        library.add(book);
        assertEquals( 1, library.collectionSize());
    }
}
