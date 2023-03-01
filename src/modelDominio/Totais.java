/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDominio;

/**
 *
 * @author magal
 */
public class Totais {
    int numVit;
    int numEmp;
    int numDer;
    int golsFeitos;
    int golsSofridos;

    public Totais(int numVit, int numEmp, int numDer, int golsFeitos, int golsSofridos) {
        this.numVit = numVit;
        this.numEmp = numEmp;
        this.numDer = numDer;
        this.golsFeitos = golsFeitos;
        this.golsSofridos = golsSofridos;
    }

    public int getNumVit() {
        return numVit;
    }

    public void setNumVit(int numVit) {
        this.numVit = numVit;
    }

    public int getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }

    public int getNumDer() {
        return numDer;
    }

    public void setNumDer(int numDer) {
        this.numDer = numDer;
    }

    public int getGolsFeitos() {
        return golsFeitos;
    }

    public void setGolsFeitos(int golsFeitos) {
        this.golsFeitos = golsFeitos;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos = golsSofridos;
    }
    
}
