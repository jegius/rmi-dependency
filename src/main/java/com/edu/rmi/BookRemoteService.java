package com.edu.rmi;


import com.edu.dto.BookRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface BookRemoteService extends Remote {
    BookRMI addBook(BookRMI book) throws RemoteException;
    BookRMI updateBook(BookRMI book) throws RemoteException;
    void deleteBook(Long id) throws RemoteException;
    List<BookRMI> getAllBooks() throws RemoteException;
    BookRMI getBook(Long id) throws RemoteException;
}
