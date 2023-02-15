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
/**
 *
 * @author magal
 */
public class JogadorDao {
    private Connection con;
    
    public JogadorDao(){
        con = Conector.getConnection();
    }
    
    public ArrayList<Jogador> getLista(){
    Statement stmt = null;
    ArrayList<Jogador> listaJogadores = new ArrayList<Jogador>();
    try{
        stmt = con.createStatement();
        ResultSet res = stmt.executeQuery("select * from jogador");
        
        while (res.next()){
            Jogador jogador = new Jogador(res.getString("nome"), res.getInt("overall"), res.getInt("gol"));
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
                String sql = "insert into Jogador (nome, overall, gols) values(?, ?, ?)";
                stmt = con.prepareStatement(sql);
                stmt.setString(1, jogador.getNome());
                stmt.setInt(2, jogador.getOverall());
                stmt.setInt(3, jogador.getGol());
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
    
}
