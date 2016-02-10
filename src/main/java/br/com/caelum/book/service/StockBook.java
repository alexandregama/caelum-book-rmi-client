package br.com.caelum.book.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import br.com.caelum.book.Book;
import br.com.caelum.book.observer.ClientObserver;

public interface StockBook extends Remote {

	void removeByCode(String code) throws RemoteException;
	
	Book findBy(String code) throws RemoteException;
	
	void addObservers(ClientObserver observer) throws RemoteException;
}
