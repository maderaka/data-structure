package com.rakateja.data.service;

import com.rakateja.data.entity.Node;

public class Stack<T> {

	private Node<T> node = null;

	public void push(T t) {
		Node<T> first = new Node<T>(t);

		// put old linked list on next of new node
		if(node != null) {
			first.setNext(this.node);
		}

		// make new node as the first of node in our linked list
		this.node = first;
	}

	public T pop() {

		// Get first node
		Node<T> data = this.node;

		// Get next node & make it as the first node
		this.node = this.node.getNext();

		// Return data in our old first node
		return data.get();
	}
}