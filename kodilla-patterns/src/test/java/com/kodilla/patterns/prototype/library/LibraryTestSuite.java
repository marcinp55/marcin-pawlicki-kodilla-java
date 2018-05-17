package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("First Library");
        IntStream.iterate(1, i -> i + 1)
                .limit(8)
                .forEach(i ->library.getBooks().add(new Book("Title " + i, "Author " + i, LocalDate.of(2000 + i, 1 + i, 1 + i))));

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Second Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Third Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().add(new Book("New Title", "New Author", LocalDate.of(2018, 3, 17)));
        //Then
        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(9, library.getBooks().size());
        Assert.assertEquals(9, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(8, deepClonedLibrary.getBooks().size());
    }
}
