package com.rakateja.data;

import com.rakateja.data.entity.Node;
import com.rakateja.data.entity.Book;

public class LinkedList {
	public static void main(String[] args) {

		Book book1 = new Book(1, "My first book", "Ni Wayan");
		Book book2 = new Book(2, "My second book", "I Made");
		Node<Book> node1 = new Node<Book>(book1);
		Node<Book> node2 = new Node<Book>(book2);

		node1.setNext(node2);

		// Print book at node 1
		System.out.println(node1.get().getTitle());

		// Find & print book at next node
		Node<Book> node = node1.getNext();
		Book book = node.get();
		System.out.println(book.getTitle());
	}
}