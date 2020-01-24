package java.edu.ssu.homework;

import sorcer.service.Context;
import sorcer.service.ContextException;

import java.rmi.RemoteException;

public interface Order {
    Context addPart (Context context) throws ContextException, RemoteException;
    Context removePart (Context context) throws ContextException, RemoteException;
    Context replacePart (Context context) throws ContextException, RemoteException;
}
