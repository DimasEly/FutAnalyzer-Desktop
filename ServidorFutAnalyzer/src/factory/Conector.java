/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author magal
 */
public class Conector {
    
    private static Connection con;
    
    public static Connection getConnection(){
        try{
            String url = "jdbc:mysql://localhost:3306/"; //caminho do banco e porta 
            String banco = "FutAnalyzer";                      //nome da base
            String usuario = "root";                       //usuário para acesso
            String senha = "";                  //senha para acesso
            
            con = DriverManager.getConnection(url + banco, usuario, senha);
            return con;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Verifique se o Mu SQL(XAMPP) está ligado");
            e.printStackTrace();
            return null;
        }
    }
    
}
