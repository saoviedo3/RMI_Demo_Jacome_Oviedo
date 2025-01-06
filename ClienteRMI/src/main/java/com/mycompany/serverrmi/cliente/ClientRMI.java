/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.serverrmi.cliente;
import com.mycompany.serverrmi.IHelloService;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author steve
 */
public class ClientRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            IHelloService helloService = (IHelloService) Naming.lookup("rmi://10.40.1.130/HelloService");
            
            String response = helloService.sayHello("Carol");
            System.out.println("Respuesta del servidor:" + response);
        }catch (Exception e){
            System.err.println("Error en el cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
}
