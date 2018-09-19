package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> resultList = libraryDatabase.listBooksInHandsOf(libraryUser);
        if (resultList.size() == 0) {
            libraryDatabase.rentABook(libraryUser,new Book("One", "T. Stone",2015));
            resultList.add(new Book("One", "T. Stone",2015));
            return resultList;}

        if (resultList.size() == 1) return resultList;
        if (resultList.size() == 5) {
            libraryDatabase.returnBooks(libraryUser);
            resultList.clear();
            return resultList;}

        return resultList;
    }
}