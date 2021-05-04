package model;

import java.util.ArrayList;


/**
 *
 * @author Adlla Katarine e Daniel Alves
 */
public class Baralho {

    private int quantidadeBaralhos;//quantidade de baralhos presente no jogo
    private ArrayList<Carta> baralho;
    /**
     * Construtor da classe
     *
     * @param quantidadeBaralhos quantidade da baralhos do jogo
     * 
     */
    public Baralho(ArrayList<Carta> baralho, int quantidadeBaralhos) {
        this.baralho = baralho;
        this.quantidadeBaralhos = quantidadeBaralhos;
    }

    public ArrayList<Carta> getBaralho(){
        return this.baralho;
    }

    public int getQuantidadeBaralhos() {
        return quantidadeBaralhos;
    }

}
    