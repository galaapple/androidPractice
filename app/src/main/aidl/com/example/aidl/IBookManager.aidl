// IBookManager.aidl
package com.example.aidl;

import com.example.aidl.myapplication.Book;

interface IBookManager {
    List<Book> getBookList();
    void addBook(in Book book);
}