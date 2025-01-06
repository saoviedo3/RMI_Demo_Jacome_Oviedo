/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.serverrmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author steve
 */
public class ServerRMI {

    public static void main(String[] args) {
        try {
           
            LocateRegistry.createRegistry(1099);
            
            IHelloService helloService = new HelloServiceImpl();
            
            Naming.rebind("HelloService", helloService);
            System.out.println("Servidor listo y escuchando en HelloService");
            
        }catch (MalformedURLException | RemoteException e){
            e.printStackTrace();
        }
    }
}
