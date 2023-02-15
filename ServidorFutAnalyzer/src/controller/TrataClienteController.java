/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import model.JogadorDao;
import model.UsuarioDao;
import modelDominio.Jogador;
import modelDominio.Usuario;
/**
 *
 * @author magal
 */
public class TrataClienteController extends Thread{
    private ObjectInputStream in;
    private ObjectOutputStream out;
    private Socket s;
    private int idUnico;
    
    //Constructor
    public TrataClienteController (Socket s, ObjectInputStream in, ObjectOutputStream out, int idUnico){
        this.s = s;
        this.in = in;
        this.out = out;
        this.idUnico = idUnico;
        this.start();
    }
    
    @Override
    public void run(){
        String comando;
        System.out.println("Esperando comandos do cliente");
        try {
            comando = (String) in.readObject();
            //enquanto comando não for "fim" permanece no looping
            while (!comando.equalsIgnoreCase("fim")) {
                System.out.println("Cliente " + idUnico + " enviou o comando: "
                        + comando);
                // Qual é o comando que o cliente quer que o servidor execute?
                if (comando.equalsIgnoreCase("UsuarioEfetuarLogin")) {
                        out.writeObject("ok");
                        Usuario usuario = (Usuario) in.readObject();
                        
                        UsuarioDao dao = new UsuarioDao();
                        Usuario usuarioSelecionado = dao.efetuarLogin(usuario);
                        
                        out.writeObject(usuarioSelecionado);
                } else if(comando.equalsIgnoreCase("UsuarioInserir")){
                    out.writeObject("ok");
                    Usuario user = (Usuario) in.readObject();
                    
                    UsuarioDao dao = new UsuarioDao();
                   dao.usuarioInserir(user);
                   out.writeObject("ok");
                } else if(comando.equalsIgnoreCase("JogadorInserir")){
                    out.writeObject("ok");
                    Jogador jogador = (Jogador) in.readObject();
                    
                    JogadorDao dao = new JogadorDao();
                    dao.inserir(jogador);
                    out.writeObject("ok");
                } else if(comando.equalsIgnoreCase("JogadorLista")){
                            out.writeObject("ok");
                            JogadorDao jogdao = new JogadorDao();
                            ArrayList<Jogador> listajogadores = jogdao.getLista();
                            out.writeObject(listajogadores);
                                    
                } else {
                    // Comando inválido e não reconhecido!
                    // Cliente pediu um comando que o servidor não conhece.
                    out.writeObject("nok");
                }
                comando = (String) in.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            // Fechando recursos ocupados pelo cliente.
            System.out.println("Cliente " + idUnico + " finalizou a conexão");
            this.in.close();
            this.out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
