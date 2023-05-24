package br.com.pi.the.icev.ed.listaencadeada;

public class teste {

	public static void main(String[] args) {
		SimpleLinkedList lista = new SimpleLinkedList();
		
		lista.addFirst("queijo");	
		System.out.println(lista);
		
		lista.addFirst("melancia");
		System.out.println(lista);
		
		lista.add("maçã", 1);
		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);
	}

}
