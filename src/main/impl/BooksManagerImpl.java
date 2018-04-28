package main.impl;

import main.manager.IBooksManager;

import java.awt.print.Book;
import java.util.List;

public class BooksManagerImpl implements IBooksManager {
    @Override
    public int insertBook(Book... books) {
        for (Book book:books) {
            
        }
        return 0;
    }
    @Override
    public int removeBooK(String name) {
        return 0;
    }
    @Override
    public int updateBook(String name) {
        return 0;
    }

    @Override
    public List<Book> queryAllBook() {
        return null;
    }

    @Override
    public Book queryBookByName(String name) {
        return null;
    }
}
