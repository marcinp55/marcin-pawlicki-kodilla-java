package com.kodilla.patterns2.adapter.company.bookclassifier;

import com.kodilla.patterns2.adapter.company.bookclassifier.librarya.BookA;
import com.kodilla.patterns2.adapter.company.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.company.bookclassifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.company.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<BookA> bookSet) {
        Map<BookSignature, BookB> bookMap = new HashMap<>();
        for (BookA book : bookSet) {
            BookSignature bookSignature = new BookSignature(book.getSignature());
            BookB bookB = new BookB(book.getAuthor(), book.getTitle(), book.getPublicationYear());
            bookMap.put(bookSignature, bookB);
        }
        return medianPublicationYear(bookMap);
    }
}
