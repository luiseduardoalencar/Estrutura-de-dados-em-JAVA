package br.com.pi.the.icev.ed.listaencadeada;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class SimpleLinkedList {

	protected Node head;
	protected Node tail;
	protected long size;

	Scanner leitor = new Scanner(System.in);
	
	public boolean isEmpty() {
        return head == null;
    }
	
	public long getSize() {
		return this.size;
	}
	
	public void addFirst(String elemento) {

		Node node = new Node(elemento, this.head);
		node.setNext(this.head);
		this.head = node;
		size += 1;
	}

	public void addLast(String elemento) {

		Node newnode = new Node(elemento, null);
		if (head == null) {
			this.head = newnode;
		} else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newnode);
		}
		this.size++;
	}

	public void add(String elemento, int index) {

		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}

		if (index == 0) {
			addFirst(elemento);
		} else if (index == size) {
			addLast(elemento);
		} else {
			Node current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.getNext();
			}
			Node newNode = new Node(elemento, null);
			newNode.setNext(current.getNext());
			current.setNext(newNode);
			size++;
		}
	}
	
	public String removeFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
			
			String removedElement = head.getElemento();
			head = head.getNext();
			size --;
			return removedElement;
		
	}
	
	public String removeLast() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		if (size == 1) {
            return removeFirst();
            
        } else {
        	
		Node current = head;
		while(current.getNext().getNext() != null) {
			current = current.getNext();
		}
		
		String removedElement = current.getNext().getElemento();
		current.setNext(null);
		size --;
		return removedElement;
        }
		
	}
	public String remove(int index) {
		 if (index < 0 || index >= size) {
	            throw new IndexOutOfBoundsException();
	        }
	        if (index == 0) {
	            return removeFirst();
	        } else if (index == size - 1) {
	            return removeLast();
	        } else {
	        	Node current = head;
	        	for(int i = 0; i < index - 1; i++) {
	        		current = current.getNext();
	        	}
	        
	        	String removedElement = current.getNext().getElemento();
	        	current.setNext(current.getNext().getNext());
	        	size --;
	        	return removedElement;
	        }
	}

	@Override
	public String toString() {

		if (this.size == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder("[");

		Node current = this.head;

		for (int i = 0; i < this.size - 1; i++) {
			builder.append(current.getElemento()).append(",");
			current = current.getNext();
		}
		builder.append(current.getElemento()).append("]");

		return builder.toString();
	}

}
