package br.com.caelum.book.observer;

import java.io.Serializable;
import java.rmi.RemoteException;

public class PublishCompany implements ClientObserver, Serializable {

	private static final long serialVersionUID = 1763181156931497457L;

	@Override
	public void notifyClient() throws RemoteException {
		System.out.println("PublishCompany Notified!");
	}

}
