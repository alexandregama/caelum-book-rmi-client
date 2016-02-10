package br.com.caelum.book.observer;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientObserver extends Remote {

	void notifyClient() throws RemoteException;
	
}
