package com.kodilla.patterns2.adapter.company.bookclassifier;

import com.kodilla.patterns2.adapter.company.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.company.bookclassifier.libraryb.Book;
import com.kodilla.patterns2.adapter.company.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.company.bookclassifier.librarya.Book> bookSet) {
        Map<BookSignature, Book> bookMap = new HashMap<>();
        for (com.kodilla.patterns2.adapter.company.bookclassifier.librarya.Book book : bookSet) {
            BookSignature bookSignature = new BookSignature(book.getSignature());
            Book bookB = new Book(book.getAuthor(), book.getTitle(), book.getPublicationYear());
            bookMap.put(bookSignature, bookB);
        }
        return medianPublicationYear(bookMap);
    }
}
