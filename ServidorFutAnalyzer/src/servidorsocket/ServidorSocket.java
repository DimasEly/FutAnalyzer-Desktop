/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidorsocket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import modelDominio.Jogador;

/**
 *
 * @author magal
 */
public class ServidorSocket {
    
    
      public static void main(String[] args) {
        // TODO code application logic here
        try {
           
           ServerSocket servidor = new ServerSocket(12345);          
           System.out.println("Servidor inicializado. Aguardando conexão...");
           while (true) {
               // cria a thread do cliente a cada nova conexão
               Socket cliente = servidor.accept();
               TrataCliente trataCliente = new TrataCliente(cliente);
           }            
           
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }    
 
}

class TrataCliente extends Thread{
    Socket cliente;
    
    public TrataCliente(Socket cliente) {
        this.cliente = cliente;        
        this.start();
    }
    
    public void run() {
        Scanner entrada = new Scanner (System.in);
        try {
            System.out.println("Cliente conectadooooo!"); 
            // Recebendo mensagem do cliente
            ObjectOutputStream out = new ObjectOutputStream(this.cliente.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(this.cliente.getInputStream());
                     
            
            ArrayList<Jogador> listaJogadores = new ArrayList<>();
            String mensagemRecebida = (String) in.readObject();
            String mensagemEnviar = "";
            while (!mensagemRecebida.equals("fim")) {
                System.out.println("Recebido do cliente: " + mensagemRecebida);
                if (mensagemRecebida.equals("cadastroJogador")) {                    
                    out.writeObject("Ok");
                    Jogador jogador = (Jogador) in.readObject();
                    listaJogadores.add(jogador);
                    mensagemEnviar = "Jogador adicionado!";
                    out.writeObject(mensagemEnviar);
                    System.out.println("jogador adicionado na lista!");
                } else if(mensagemRecebida.equals("listaJogadores")) {                    
                    out.writeObject(listaJogadores);                    
                    System.out.println("Enviando lista de produtos para o cliente! Tamanho da lista: " + listaJogadores.size());
                }  
                
                mensagemRecebida = (String)in.readObject();
            }      
            
           in.close();
           out.close();
           this.cliente.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException classNot) {
            classNot.printStackTrace();
        }
    }
}

