/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import factory.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        
        
        System.out.println("Vou tentar me logar - Usuario: " + user.getUsuario() + ", Senha: " + user.getSenha());
        try{
            String sql = " select * from usuario where usuario = ? and senha = ?";
            
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, user.getUsuario());
            stmt.setString(2, user.getSenha());
            
            //executando o select
            ResultSet res = stmt.executeQuery();
            
            while (res.next()){
                //nome, senha, usuario
                userselecionado = new Usuario(res.getString("usuario"),
                res.getString("senha"));
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
}
