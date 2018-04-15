package com.kodilla.testing.library;

import com.sun.org.apache.bcel.internal.generic.LSTORE;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    static int counter = 1;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Starting test suite.");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test suite finished.");
    }

    @Before
    public void beforeCase() {
        System.out.println("Starting test number " + counter);
    }

    @After
    public void afterCase() {
        System.out.println("Ending test number " + counter);
        counter++;
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOf() {
        //Given
        LibraryDatabase libraryDatabaseMock1 = mock(LibraryDatabase.class);
        LibraryDatabase libraryDatabaseMock2 = mock(LibraryDatabase.class);
        LibraryDatabase libraryDatabaseMock3 = mock(LibraryDatabase.class);

        BookLibrary library1 = new BookLibrary(libraryDatabaseMock1);
        BookLibrary library2 = new BookLibrary(libraryDatabaseMock2);
        BookLibrary library3 = new BookLibrary(libraryDatabaseMock3);

        List<Book> emptyBookList = generateListOfNBooks(0);
        List<Book> oneBookList = generateListOfNBooks(1);
        List<Book> fiveBookList = generateListOfNBooks(5);

        LibraryUser libraryUser1 = new LibraryUser("John", "One", "1111");
        LibraryUser libraryUser2 = new LibraryUser("John", "Two", "2222");
        LibraryUser libraryUser3 = new LibraryUser("John", "Three", "3333");

        when(library1.listBooksInHandsOf(libraryUser1)).thenReturn(emptyBookList);
        when(library2.listBooksInHandsOf(libraryUser2)).thenReturn(oneBookList);
        when(library3.listBooksInHandsOf(libraryUser3)).thenReturn(fiveBookList);

        //When
        List<Book> userBookList1 = library1.listBooksInHandsOf(libraryUser1);
        List<Book> userBookList2 = library2.listBooksInHandsOf(libraryUser2);
        List<Book> userBookList3 = library3.listBooksInHandsOf(libraryUser3);

        //Then
        Assert.assertEquals(0, userBookList1.size());
        Assert.assertEquals(1, userBookList2.size());
        Assert.assertEquals(5, userBookList3.size());
    }
}
