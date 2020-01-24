package java.edu.ssu.homework;

import sorcer.service.Context;
import sorcer.service.ContextException;

import java.rmi.RemoteException;

public interface Payment {
    Context pay(Context context) throws ContextException, RemoteException;

    /** Non generic methods of payment **/
    Context payWithCardCredit(Context context) throws ContextException, RemoteException;
    Context payWithCardDebit(Context context) throws ContextException, RemoteException;
    Context payWithTransfer(Context context) throws ContextException, RemoteException;
    Context payWithCash(Context context) throws ContextException, RemoteException;
    Context payWithBlik(Context context) throws ContextException, RemoteException;
}
