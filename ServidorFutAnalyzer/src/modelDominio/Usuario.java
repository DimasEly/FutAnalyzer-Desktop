/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDominio;

import java.io.Serializable;

/**
 *
 * @author magal
 */
public class Usuario implements Serializable {
    public static final long serialVersionUID = 321L;
    private String usuario;
    private String senha;
    private String email;

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", senha=" + senha + ", email=" + email + '}';
    }
    
    
}
