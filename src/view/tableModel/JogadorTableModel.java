/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.tableModel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelDominio.Jogador;
/**
 *
 * @author gabif
 */
public class JogadorTableModel extends AbstractTableModel{

    private ArrayList<Jogador> listaJogador;
    
    // método construtor que recebe como parâmetro a lista de Marcas
    public JogadorTableModel(ArrayList<Jogador> listaJogador) {
        this.listaJogador = listaJogador;
    }
    
    // sobrescrita do método que diz quantas LINHAS a tabela tem
    @Override
    public int getRowCount() {
        return listaJogador.size();
    }
    
    // sobrescrita do método que diz quantas COLUNAS a tabela tem
    @Override
    public int getColumnCount() {
        return 2;
    }
    
    // sobrescrita do método que retorna o valor de cada coluna
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Jogador jogador = listaJogador.get(rowIndex);

        switch (columnIndex) {
            case 0: return jogador.getCod();
            case 1: return jogador.getNome();
            default: return "";
        }
    }
    
    // sobrescrita do método que retorna o nome de cada coluna
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Código";
            case 1: return "Nome";
            default: return "NoName";
        }
    }
    
    // método que retorna um objeto de Marca 
    // a partir da linha que o usuário selecionou.
    public Jogador getJogador(int row) {
        return listaJogador.get(row);
    }
}
