/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelDominio.Jogador;
import modelDominio.Usuario;

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
    
    public String jogadorExcluir (Jogador jogador){
        String msg = "";
        
        try{
            out.writeObject("JogadorExcluir");
            msg = (String) in.readObject();  //lendo o ok
            out.writeObject(jogador);        //escrevendo a Marca
            msg = (String) in.readObject();  //lendo o ok
            
            return msg;
        }catch(Exception ex){
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
    
    public ArrayList<Jogador> JogadorLista(){
        String msg;
        try{
            out.writeObject("JogadorLista");
            msg = (String) in.readObject();
            Usuario usuarioSelecionado = 
                    (Usuario) in.readObject();
            return (ArrayList<Jogador>)in.readObject();
        } catch (Exception e){
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
