package com.rakateja.data;

import com.rakateja.data.service.Stack;
import com.rakateja.data.entity.Book;

public class StackApp {
	public static void main(String[] args) {

		Stack<Book> stack = new Stack<Book>();

		// Instance & put some books in our stack
		Book book1 = new Book(1, "My first book", "Ni Wayan");
		Book book2 = new Book(2, "My second book", "I Made");
		Book book3 = new Book(3, "My third book", "Ni Nyoman");
		Book book4 = new Book(4, "My fourth book", "I Ketut");

		stack.push(book1);
		stack.push(book2);
		stack.push(book3);
		stack.push(book4);

		// Pop & write them one by one
		book1 = stack.pop();
		book2 = stack.pop();
		book3 = stack.pop();
		book4 = stack.pop();

		System.out.println(book1.getTitle() + " -> " + book1.getAuthor());
		System.out.println(book2.getTitle() + " -> " + book2.getAuthor());
		System.out.println(book3.getTitle() + " -> " + book3.getAuthor());
		System.out.println(book4.getTitle() + " -> " + book4.getAuthor());
	}
}