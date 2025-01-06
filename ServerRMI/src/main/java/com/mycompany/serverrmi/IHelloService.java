/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.serverrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author steve
 */
public interface IHelloService extends Remote {
    String sayHello(String name) throws RemoteException;
}
