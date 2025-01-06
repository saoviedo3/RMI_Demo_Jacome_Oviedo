/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serverrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author steve
 */
public class HelloServiceImpl extends UnicastRemoteObject implements IHelloService{
    
    public HelloServiceImpl() throws RemoteException{
      super();  
    }
    
    @Override
    public String sayHello(String name) throws RemoteException{
        return "Hello, " + name + "!";
    }
    
}
    