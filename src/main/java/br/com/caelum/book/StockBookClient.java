package br.com.caelum.book;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import br.com.caelum.book.observer.BookAutor;
import br.com.caelum.book.observer.PublishCompany;
import br.com.caelum.book.service.StockBook;

public class StockBookClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		System.setProperty("java.security.policy", "/Users/alexandregama/developer/java/workspace/caelum-book-rmi-client/java.policy");
		System.setSecurityManager(new SecurityManager());
		
		StockBook service = (StockBook) Naming.lookup("rmi://localhost:1099/stockservice");
		
		service.addObservers(new PublishCompany());
		service.addObservers(new BookAutor());
		service.removeByCode("TDD");
	}
	
}
