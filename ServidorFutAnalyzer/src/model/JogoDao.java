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
import modelDominio.Jogo;
import modelDominio.Usuario;

/**
 *
 * @author magal
 */
public class JogoDao {
    private Connection con;
    
    public JogoDao(){
        con = Conector.getConnection();
    }
    
    public ArrayList<Jogo> getListaJogo(Usuario user){
        PreparedStatement stmt = null;
        ArrayList<Jogo> listaJogos= new ArrayList<Jogo>();
        try{
            String sql = "select * from jogo where usuario_id = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, user.getCod());
            stmt.execute();
            ResultSet res = stmt.executeQuery();
            
            while (res.next()){
                Jogo jogo = new Jogo (res.getInt("id"), res.getInt("placarMeu")
                        ,res.getInt("placarAdv"), res.getInt("usuario_id"));
                listaJogos.add(jogo);
            }
            res.close();
            stmt.close();
            con.close();
            return listaJogos;
            
        } catch (SQLException e){
            System.out.println(e.getErrorCode() + "-" + e.getMessage());
        return null;
        }
    }
    
    public int inserir (Jogo jogo){
        PreparedStatement stmt = null;
        
        try{
            try{
                con.setAutoCommit(false);
                String sql = "insert into Jogo (placarMeu, placarAdv, usuario_id) values (?, ?, ?)";
                stmt = con.prepareStatement(sql);
                stmt.setInt(1, jogo.getMeuPlacar());
                stmt.setInt(2, jogo.getAdvPlacar());
                stmt.setInt(3, jogo.getIdUsuario());
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
            } catch (SQLException e){
                e.printStackTrace();
                return e.getErrorCode();
            }
        }
    }
    public int excluir (int codJogo){
        PreparedStatement stmt = null;
        try{
            try{
                con.setAutoCommit(false);
                String sql = "delete from jogo where id = ?";
                stmt = con.prepareStatement(sql);
                stmt.setInt(1, codJogo);
                stmt.execute();
                con.commit();
                return -1;
            } catch(SQLException e){
                try{
                    con.rollback();
                    return e.getErrorCode();
                } catch(SQLException ex){
                    return ex.getErrorCode();
                }
            }
        } finally{
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
