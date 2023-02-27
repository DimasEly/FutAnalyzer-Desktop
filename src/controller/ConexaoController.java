/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelDominio.Jogador;
import modelDominio.Jogo;
import modelDominio.Usuario;
import view.FutAnalyzer;

/**
 *
 * @author gabif
 */
public class ConexaoController {
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private int idUnico;
    
    public Usuario usuario;
    private Usuario usuarioLogado;

    public ConexaoController(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
    
    
    public ConexaoController(ObjectInputStream in, ObjectOutputStream out, int idUnico) {
        this.in = in;
        this.out = out;
        this.idUnico = idUnico;
        
    }
    
    public Usuario efetuarLogin(Usuario usuario){
        String msg;
        try{
            out.writeObject("UsuarioEfetuarLogin"); //mandando para o servidor
            msg = (String) in.readObject();
            out.writeObject(usuario);
            Usuario usuarioSelecionado = 
                    (Usuario) in.readObject();
            
            return usuarioSelecionado;
        } catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public String inserirJogador(Jogador jogador){
        String msg;
        try{
            out.writeObject("JogadorInserir");//chamando servidor
            msg = (String) in.readObject();
            if(msg.equals("ok")){//servidor respondendo
                out.writeObject(jogador); //enviando jogador para o servidor
                return (String) in.readObject();
            }else{
                return "nok";
            }
        } catch (Exception e){
            return null;
        }
    }
    
    public String inserirJogo(Jogo jogo){
        String msg;
        try{
            out.writeObject("JogoInserir");
            msg = (String) in.readObject();
            if(msg.equals("ok")){
                out.writeObject(jogo);
                return (String) in.readObject();
            } else {
                return "nok";
            }
        } catch (Exception e){
            return null;
        }
    }
    
    public String jogadorExcluir (Jogador jogador){
        String msg = "";
        
        try{
            out.writeObject("JogadorExcluir");
            msg = (String) in.readObject();  //lendo o ok
            out.writeObject(jogador.getCod());        //escrevendo a Marca
            msg = (String) in.readObject();  //lendo o ok
            
            return msg;
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    
    public String jogoExcluir (Jogo jogo){
        String msg = "";
        try{
            out.writeObject("JogoExcluir");
            msg = (String) in.readObject();
            out.writeObject(jogo.getId());
            msg = (String) in.readObject();
            
            return msg;
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    
    public String jogadorAlterar(Jogador jogador){
        String msg = "";
        
        try{
            out.writeObject("JogadorAlterar");
            msg = (String) in.readObject(); // lendo ok
            out.writeObject(jogador);       // escrevendo o Jogador
            msg = (String) in.readObject(); // lendo ok
            
            return msg;
        } catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    
    public String jogoAlterar (Jogo jogo){
        String msg = "";
        
        try{
            out.writeObject("JogoAlterar");
            msg = (String) in.readObject();
            out.writeObject(jogo);
            msg = (String) in.readObject();
            
            return msg;
        } catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    
   /* public Boolean jogadorAlterar(Jogador jogador){
        String msg = "";
        try{
            out.writeObject("JogadorExcluir");
            msg = (String) in.readObject(); // lendo ok
            out.writeObject(jogador); // escrevendo o jogador
            msg = (String) in.readObject(); // lendo ok
            if (msg.equals("ok")){
                return true;
            }else{
                return false;
            }
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }*/
    
    public ArrayList<Jogador> jogadorLista(){
        String msg;
        try{
            out.writeObject("JogadorLista");
            out.writeObject(FutAnalyzer.ccont.usuarioLogado);
            return (ArrayList<Jogador>)in.readObject();
        } catch (Exception e){
            return null;
        }
    }
    
    public ArrayList<Jogador> jogadorListaNome(String nome){
        String msg;
        try{
            out.writeObject("JogadorListaNome");
            msg = (String) in.readObject(); //lendo o ok
            out.writeObject(nome); //escrevendo o filtro
            ArrayList<Jogador> listaJogador = (ArrayList<Jogador>) in.readObject();
            return listaJogador;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<Jogador> jogadorListaOver(String overall){
        String msg;
        try{
            out.writeObject("JogadorListaOver");
            msg = (String) in.readObject();
            out.writeObject(overall);
            ArrayList<Jogador> listaJogador = (ArrayList<Jogador>) in.readObject();
            return listaJogador;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
    
}
