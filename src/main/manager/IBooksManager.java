package main.manager;

import java.awt.print.Book;
import java.util.List;

/**
 * 图书管理
 */
public interface IBooksManager {
    /**
     * insert
     */
    int insertBook(Book... books);
    /**
     * remove
     */
    int removeBooK(String name);
    /**
     *update
     */
    int updateBook(String name);
    /**
     *query all
     */
    List<Book> queryAllBook();

    /**
     *query by name
     */
   Book queryBookByName(String name);
}
