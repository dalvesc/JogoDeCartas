package controller;

import java.util.ArrayList;
import model.Baralho;
import model.Carta;
import factory.BaralhoFactory;


/**
 * Controller para criar e embaralhar baralho.
 * 
 * @author Adlla Katarine e Daniel Alves
 */
public class ControllerMenu {
    ArrayList<Carta> baralho;

    public ControllerMenu(int quantidadeBaralho) {
        BaralhoFactory bf = new BaralhoFactory();
        Baralho br = bf.criarBaralho(quantidadeBaralho);
        this.baralho = br.getBaralho();
    }

    /**
     * Método que retorna o baralho embaralhado.
     * 
     * @return ArrayList<Carta> - retorna o baralho.
     */
    public ArrayList<Carta> getBaralhoEmbaralhado(){
        return this.baralho;
    }
}