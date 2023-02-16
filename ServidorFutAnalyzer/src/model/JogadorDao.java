/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import java.sql.Statement;
import factory.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import modelDominio.Jogador;
import modelDominio.Usuario;
/**
 *
 * @author magal
 */
public class JogadorDao {
    private Connection con;
    
    public JogadorDao(){
        con = Conector.getConnection();
    }
    
    public ArrayList<Jogador> getLista(Usuario user){
    PreparedStatement stmt = null;
    ArrayList<Jogador> listaJogadores = new ArrayList<Jogador>();
    try{
        String sql = "select * from jogador where Usuario_id = ?";
        stmt= con.prepareStatement(sql);
        stmt.setInt(1, user.getCod());
        stmt.execute();
        ResultSet res = stmt.executeQuery();

        while (res.next()){
            Jogador jogador = new Jogador(res.getInt("id"), res.getString("nome"), res.getInt("overall"), res.getInt("gols"), res.getInt("Usuario_id"));
            listaJogadores.add(jogador);
        }
        res.close();
        stmt.close();
        con.close();
        return listaJogadores;
    } catch (SQLException e){
        System.out.println(e.getErrorCode() + "-" + e.getMessage());
        return null;
    }
}
    
    public int inserir (Jogador jogador){
        PreparedStatement stmt = null;
      
        try{
            try{
                con.setAutoCommit(false);
                String sql = "insert into Jogador (nome, overall, gols, Usuario_id) values(?, ?, ?, ?)";
                stmt = con.prepareStatement(sql);
                stmt.setString(1, jogador.getNome());
                stmt.setInt(2, jogador.getOverall());
                stmt.setInt(3, jogador.getGol());
                
                stmt.setInt(4, jogador.getIdUsuario());
                stmt.execute();
                con.commit();
                return -1;
            } catch (SQLException e){
                try{
                    con.rollback();
                    e.printStackTrace();
                    return e.getErrorCode();
                } catch (SQLException ex){
                    ex.printStackTrace();
                    return ex.getErrorCode();
                }
            }
        } finally {
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
    
//    public int alterar (Jogador jogador){
//        
//    }
    
    public int excluir (int codJogador){
        PreparedStatement stmt = null;
        try{
            try{
                con.setAutoCommit(false);
                String sql = "delete from jogador where id = ?";
                stmt = con.prepareStatement(sql);
                stmt.setInt(1, codJogador);
                stmt.execute();
                con.commit();
                return -1;
            } catch (SQLException e){
                try{
                    con.rollback();
                    return e.getErrorCode();
                } catch (SQLException ex){
                    return ex.getErrorCode();
                }
            }
        } finally {
            try{
                stmt.close();
                con.setAutoCommit(true);
                con.close();
            } catch (SQLException e){
                return e.getErrorCode();
            }
        }
    }
    
}
