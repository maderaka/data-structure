package com.rakateja.data.entity;

public class Node<T> {
	private T data;
	private Node<T> next;

	public Node(T data) {
		this.data = data;
	}

	public T get() {
		return this.data;
	}

	public void set(T t) {
		this.data = t;
	}

	public Node<T> getNext() {
		return this.next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}