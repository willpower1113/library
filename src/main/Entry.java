package main;

import main.bean.Book;
import main.jdbc.ConnectManager;

public class Entry {
    public static void main(String[] args) {
        //创建表
       ConnectManager.init().createTable();
       int result = ConnectManager.insert(new Book("测试"));
       System.out.print(result);
    }
}
