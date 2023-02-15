/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.tableModel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelDominio.Usuario;

/**
 *
 * @author gabif
 */
public class UsuarioTableModel extends AbstractTableModel {
    
    private ArrayList<Usuario> listaUsuarios;

    // método construtor que recebe como parâmetro a lista de Marcas
    public UsuarioTableModel(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    // sobrescrita do método que diz quantas LINHAS a tabela tem
    @Override
    public int getRowCount() {
        return listaUsuarios.size();
    }

    // sobrescrita do método que diz quantas COLUNAS a tabela tem
    @Override
    public int getColumnCount() {
        return 5;
    }

    // sobrescrita do método que retorna o valor de cada coluna
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = listaUsuarios.get(rowIndex);

        switch (columnIndex) {
            case 0: return usuario.getCod();
            case 1: return usuario.getUsuario();
            case 3: return usuario.getSenha();
            case 4: return usuario.getEmail();
            default: return "";
        }
    }

    // sobrescrita do método que retorna o nome de cada coluna
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Código";
            case 1: return "Nome";
            case 2: return "Senha";
            case 3: return "Email";
            default: return "NoName";
        }
    }

    // método que retorna um objeto de Marca 
    // a partir da linha que o usuário selecionou.
    public Usuario getUsuario(int row) {
        return listaUsuarios.get(row);
    }
}