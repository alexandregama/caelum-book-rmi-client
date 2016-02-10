package br.com.caelum.book.observer;

import java.io.Serializable;
import java.rmi.RemoteException;

public class BookAutor implements ClientObserver, Serializable {

	private static final long serialVersionUID = 8251729207307481210L;

	@Override
	public void notifyClient() throws RemoteException {
		System.out.println("BookAutor Notified!");
	}

}
