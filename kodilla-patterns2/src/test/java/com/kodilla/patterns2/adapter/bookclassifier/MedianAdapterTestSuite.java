package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.company.bookclassifier.MedianAdapter;
import com.kodilla.patterns2.adapter.company.bookclassifier.librarya.BookA;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<BookA> bookASet = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();

        BookA bookA1 = new BookA("Author 1", "Title 1", 2000, "A");
        BookA bookA2 = new BookA("Author 2", "Title 2", 2001, "B");
        BookA bookA3 = new BookA("Author 3", "Title 3", 2002, "C");
        BookA bookA4 = new BookA("Author 4", "Title 4", 2003, "D");
        BookA bookA5 = new BookA("Author 5", "Title 5", 2004, "E");

        bookASet.add(bookA1);
        bookASet.add(bookA2);
        bookASet.add(bookA3);
        bookASet.add(bookA4);
        bookASet.add(bookA5);

        //When
        int publicationYearMedian = medianAdapter.publicationYearMedian(bookASet);

        //Then
        Assert.assertEquals(2002, publicationYearMedian);
    }
}
