/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import factory.Conector;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelDominio.Usuario;

/**
 *
 * @author magal
 */
public class UsuarioDao {
    
    private Connection con;
    
    public UsuarioDao(){
        con = Conector.getConnection();
    }
    
    public Usuario efetuarLogin(Usuario user) {
        PreparedStatement stmt = null;
        Usuario userselecionado = null;
        
        String senhaHash = null;
        
        try {
        
            MessageDigest md = MessageDigest.getInstance("MD5"); // MD5, SHA-1, SHA-256
        
            BigInteger senhaHashDigitada = new BigInteger(1, md.digest(user.getSenha().getBytes()));
            senhaHash = senhaHashDigitada.toString();          
            
        } catch (NoSuchAlgorithmException e) {
             System.out.println("Erro ao carregar o MessageDigest");
        }
        
//        System.out.println("Vou tentar me logar - Usuario: " + user.getUsuario() + ", Senha: " + user.getSenha());
        try{
            String sql = " select * from usuario where usuario = ? and senha = ?";
            
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, user.getUsuario());
            stmt.setString(2, senhaHash);
           
            
            //executando o select
            ResultSet res = stmt.executeQuery();
            
            while (res.next()){
                //nome, senha, usuario
                userselecionado = new Usuario( res.getString("usuario"),
                res.getString("senha"), res.getString("email"), res.getInt("id"));
            }
            res.close();
            stmt.close();
            con.close();
            return userselecionado;
      
        } catch (SQLException e){
            System.out.println(e.getErrorCode() + "-" + e.getMessage());
            return null;
    }
    }
    
   public int usuarioInserir(Usuario user){
       PreparedStatement stmt = null;
       try{
           try{
               con.setAutoCommit(false);
               String sql = "insert into Usuario(usuario, email, senha) values(?, ?, ?)";
               stmt = con.prepareStatement(sql);
               String senhaHash = null;
               try {

                    MessageDigest md = MessageDigest.getInstance("MD5"); // MD5, SHA-1, SHA-256

                    BigInteger senhaHashCadastrada = new BigInteger(1, md.digest(user.getSenha().getBytes()));
                    senhaHash = senhaHashCadastrada.toString();
                    System.out.println(senhaHashCadastrada);

                    Usuario usr = new Usuario(user.getUsuario(), senhaHash);

                    } catch (NoSuchAlgorithmException e) {
                        System.out.println("Erro ao carregar o MessageDigest");
                    }
               
               stmt.setString(1, user.getUsuario());
               stmt.setString(2, user.getEmail());
               stmt.setString(3, senhaHash);
               stmt.execute();
               con.commit();
               return -1;
           } catch (SQLException e) {
               return e.getErrorCode();
           }
       } finally{
           try{
               stmt.close();
               con.setAutoCommit(true);
               con.close();
           } catch(SQLException e){
               e.printStackTrace();
               return e.getErrorCode();
           }
       }
   }
}
