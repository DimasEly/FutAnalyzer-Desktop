/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ConexaoController;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
/**
 *
 * @author gabif
 */
public class FutAnalyzer {
    
    public static ConexaoController ccont;
    public static int idUsuario;
    
    public static void main(String[] args) {
        Socket socket;
        ObjectInputStream in = null;
        ObjectOutputStream out = null;
        int idUnico=0;
        try{
            socket = new Socket("127.0.0.1", 12345); //localhost
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
            //out.writeObject(0);
            //idUnico = (int) in.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // Criando o controller geral e a tela principal
        ccont = new ConexaoController(in,out,idUnico);

        // Aqui vai o comando que chama a primeira tela ***********************
        FormLogin fl = new FormLogin();
        fl.setVisible(true);
    }
}
