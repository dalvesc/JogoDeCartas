package controller;

import java.util.ArrayList;
import model.Baralho;
import model.Carta;
import util.Embaralhar;


/**
 * Controller para criar e embaralhar baralho.
 * 
 * @author Adlla Katarine e Daniel Alves
 */
public class ControllerMenu {
    ArrayList<Carta> baralho;

    public ControllerMenu(int quantidadeBaralho) {
        Baralho br = new Baralho(quantidadeBaralho);
        this.baralho = br.getBaralho();
        this.baralho = Embaralhar.embaralhar(this.baralho);
    }


    /**
     * 
     * Método que retorna o baralho embaralhado.
     * 
     * @return ArrayList<Carta> - retorna o baralho.
     */
    public ArrayList<Carta> getBaralhoEmbaralhado(){
        return this.baralho;
    }
}
