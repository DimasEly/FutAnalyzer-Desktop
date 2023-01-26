/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author magal
 */
import controller.TrataClienteController;
import factory.Conector;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import modelDominio.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Geovane
 */
public class Principal {

    public static void main(String[] args) {
        Connection con;
        con = Conector.getConnection();

        try {
            // iniciando servidor na porta 12345
            ServerSocket servidor = new ServerSocket(12345);
            System.out.println("Servidor inicializado. Aguardando conexão...");
            ConectaServidor s1 = new ConectaServidor(servidor, con);
            s1.start();
            Usuario usuario = new Usuario("123456", "Dimas");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class ConectaServidor extends Thread {

    private ServerSocket servidor;
    private int idUnico; // Nº para identificar o cliente que está conectando...
    private Connection con;

    public ConectaServidor(ServerSocket servidor, Connection con) {
        this.servidor = servidor;
        this.con = con;
        this.start();
    }

    public void run() {
        try {
            while (true) {
                Socket cliente = this.servidor.accept();
                System.out.println("Um novo cliente conectou : " + cliente);

                // Criando um objeto de streaming para receber e enviar os dados
                ObjectInputStream in = new ObjectInputStream(cliente.getInputStream());
                ObjectOutputStream out = new ObjectOutputStream(cliente.getOutputStream());
                idUnico++; // incrementanto a conexão deste cliente.
                System.out.println("Iniciando uma nova Thread para o Cliente " + idUnico);
                TrataClienteController tratacliente = new TrataClienteController(cliente, in, out, idUnico);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
