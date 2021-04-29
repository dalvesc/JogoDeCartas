package model;

import java.util.ArrayList;


/**
 *
 * @author Adlla Katarine e Daniel Alves
 */
public class Baralho {

    private int quantidadeBaralhos;//quantidade de baralhos presente no jogo
    private ArrayList<Carta> cartas = new ArrayList<Carta>(52);//array para armazenar as cartas
    private final String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};//valores presente do baralho
    private final String[] naipes = {"♣", "♥", "♠", "♦"};//naipes do baralho
    
    /**
     * Construtor da classe
     *
     * @param quantidadeBaralhos quantidade da baralhos do jogo
     * 
     */
    public Baralho(int quantidadeBaralhos) {
        this.quantidadeBaralhos = quantidadeBaralhos;
        criarBaralho();
    }


    /**
     * Função para criação do baralho
     * 
     */
    private void criarBaralho(){
        int quantidadeBaralho = 0;//quantidade de baralhos presente no jogo
        while(quantidadeBaralho < this.quantidadeBaralhos){
            for(String naipe: naipes){//naipes do baralho
                int i = 0;
                for(String valor: valores){//valores presente do baralho
                    cartas.add(new Carta(naipe, valor, i));//criação de nova carta
                    i = i + 1;
                }
            }
            quantidadeBaralho++;
        }    
    }


    public ArrayList<Carta> getBaralho(){
        return this.cartas;
    }
}
    