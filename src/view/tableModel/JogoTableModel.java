/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.tableModel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelDominio.Jogo;

/**
 *
 * @author magal
 */
public class JogoTableModel extends AbstractTableModel{
    private ArrayList<Jogo> listaJogo;
    
    // método construtor que recebe como parâmetro a lista de jogadores
    public JogoTableModel(ArrayList<Jogo> listaJogo){
        this.listaJogo = listaJogo;
    }

    // sobrescrita do método que diz quantas LINHAS a tabela tem
    @Override
    public int getRowCount() {
        return listaJogo.size();
    }

    // sobrescrita do método que diz quantas COLUNAS a tabela tem
    @Override
    public int getColumnCount() {
        return 2;
    }

    // sobrescrita do método que retorna o valor de cada coluna
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Jogo jogo = listaJogo.get(rowIndex);
        
        switch (columnIndex){
            case 0: return jogo.getMeuPlacar();
            case 1: return jogo.getAdvPlacar();
            default: return "";
        }
    }

    @Override
    public String getColumnName(int column) {
       switch (column){
           case 0: return "Meu placar";
           case 1: return "Placar oponente";
           default: return "noPlacar";
       }
    }
    
    // método que retorna um objeto de Jogo
    // a partir da linha que o usuário selecionou.
    public Jogo getJogo(int row){
        return listaJogo.get(row);
    }
    
}
