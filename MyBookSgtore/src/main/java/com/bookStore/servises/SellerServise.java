package com.bookStore.servises;

import java.awt.print.Book;
import java.util.List;

public interface SellerServise {

	public Book addBook(Book book);
	public String delete(int id);
	public Book updateBook(int id);
	public int totalBooks();
	public List<Book> allBook();
	
}
