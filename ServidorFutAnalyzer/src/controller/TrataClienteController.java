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
import model.JogoDao;
import model.UsuarioDao;
import modelDominio.Jogador;
import modelDominio.Jogo;
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
                } else if(comando.equalsIgnoreCase("JogadorAlterar")){
                    out.writeObject("ok");
                    Jogador jogador = (Jogador) in.readObject();
                    
                    JogadorDao jogdao = new JogadorDao();
                    jogdao.alterar(jogador);
                    out.writeObject("ok");
                } else if(comando.equalsIgnoreCase("JogadorExcluir")){
                    out.writeObject("ok");
                    int codJogador = (int) in.readObject();
                    
                    JogadorDao jogdao = new JogadorDao();
                    jogdao.excluir(codJogador);
                    out.writeObject("ok");
                } else if(comando.equalsIgnoreCase("JogadorLista")){
                            Usuario user = (Usuario) in.readObject();
                            JogadorDao jogdao = new JogadorDao();
                            ArrayList<Jogador> listajogadores = jogdao.getLista(user);
                            out.writeObject(listajogadores);
                            
                } else if (comando.equalsIgnoreCase("JogadorListaNome")){
                            Usuario user = (Usuario) in.readObject();
                            JogadorDao jogadorDao = new JogadorDao();
                            String nome = (String) in.readObject();
     
                            ArrayList<Jogador> listaJogador = jogadorDao.getListaNome(user, nome);
                            out.writeObject(listaJogador);
                } else if(comando.equalsIgnoreCase("JogoLista")){    
                            Usuario user = (Usuario) in.readObject();
                            JogoDao jogoDao = new JogoDao();
                            ArrayList<Jogo> listaJogos = jogoDao.getListaJogo(user);
                            out.writeObject(listaJogos);
                } else if(comando.equalsIgnoreCase("JogoListasEstatisticas")){    
                            Usuario user = (Usuario) in.readObject();
                            JogoDao jogoDao = new JogoDao();
                            ArrayList<Jogo> listaJogosVitoria = jogoDao.getListaVitorias(user);
                            out.writeObject(listaJogosVitoria);
                            JogoDao jogoDao2 = new JogoDao();
                            ArrayList<Jogo> listaJogosEmpate = jogoDao2.getListaEmpates(user);
                            out.writeObject(listaJogosEmpate);
                            JogoDao jogoDao3 = new JogoDao();
                            ArrayList<Jogo> listaJogosDerrotas = jogoDao3.getListaDerrotas(user);
                            out.writeObject(listaJogosDerrotas); 
                            JogoDao jogoDao4 = new JogoDao();
                            int golsFeitos = jogoDao4.getGolsFeitos(user);
                            out.writeObject(golsFeitos);
                            JogoDao jogoDao5 = new JogoDao();
                            int golsSofridos = jogoDao5.getGolsSofridos(user);
                            out.writeObject(golsSofridos);
                } else if(comando.equalsIgnoreCase("JogoListasEstatisticasDesktop")){    
                            Usuario user = (Usuario) in.readObject();
                            JogoDao jogoDao = new JogoDao();
                            ArrayList<Jogo> listaJogosVitoria = jogoDao.getListaVitorias(user);
                            out.writeObject(listaJogosVitoria);
                            JogoDao jogoDao2 = new JogoDao();
                            ArrayList<Jogo> listaJogosEmpate = jogoDao2.getListaEmpates(user);
                            out.writeObject(listaJogosEmpate);
                            JogoDao jogoDao3 = new JogoDao();
                            ArrayList<Jogo> listaJogosDerrotas = jogoDao3.getListaDerrotas(user);
                            out.writeObject(listaJogosDerrotas); 
                                } else if(comando.equalsIgnoreCase("JogoListasEstatisticas")){    
                            Usuario user = (Usuario) in.readObject(); 
                            JogoDao jogoDao = new JogoDao();
                            int golsFeitos = jogoDao.getGolsFeitos(user);
                            out.writeObject(golsFeitos);
                            JogoDao jogoDao2 = new JogoDao();
                            int golsSofridos = jogoDao2.getGolsSofridos(user);
                            out.writeObject(golsSofridos);
                            
                }else if(comando.equalsIgnoreCase("JogoListaVitorias")){    
                            Usuario user = (Usuario) in.readObject();
                            JogoDao jogoDao = new JogoDao();
                            ArrayList<Jogo> listaJogosVitoria = jogoDao.getListaVitorias(user);
                            out.writeObject(listaJogosVitoria);
                
                 } else if(comando.equalsIgnoreCase("JogoListaEmpates")){    
                            Usuario user = (Usuario) in.readObject();
                            JogoDao jogoDao = new JogoDao();
                            ArrayList<Jogo> listaJogosEmpate = jogoDao.getListaEmpates(user);
                            out.writeObject(listaJogosEmpate);            
                            
                } else if(comando.equalsIgnoreCase("JogoListaDerrotas")){    
                            Usuario user = (Usuario) in.readObject();
                            JogoDao jogoDao = new JogoDao();
                            ArrayList<Jogo> listaJogosDerrota = jogoDao.getListaDerrotas(user);
                            out.writeObject(listaJogosDerrota);
                                        
                } else if(comando.equalsIgnoreCase("JogoInserir")){
                    out.writeObject("ok");
                    Jogo jogo = (Jogo) in.readObject();
                    
                    JogoDao jogodao = new JogoDao();
                    jogodao.inserir(jogo);
                    out.writeObject("ok");
                    
                    } else if(comando.equalsIgnoreCase("JogoAlterar")){
                    out.writeObject("ok");
                    Jogo jogo = (Jogo) in.readObject();
                    System.out.println(jogo);
                    
                    JogoDao jogodao = new JogoDao();
                    jogodao.alterar(jogo);
                    out.writeObject("ok");
                    
                } else if(comando.equalsIgnoreCase("JogoExcluir")){
                    out.writeObject("ok");
                    int codJogo = (int) in.readObject();
                    
                    JogoDao jogodao = new JogoDao();
                    jogodao.excluir(codJogo);
                    out.writeObject("ok");
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
