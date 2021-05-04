package factory;

import java.util.ArrayList;

import model.Baralho;
import model.Carta;
import util.Embaralhar;


/**
 *
 * Factory que cria o baralho.
 * 
 * @author Adlla Katarine e Daniel Alves
 */
public class BaralhoFactory {
    
    private final String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};//valores presente do baralho
    private final String[] naipes = {"♣", "♥", "♠", "♦"};//naipes do baralho

    public BaralhoFactory(){}

    /**
     * Método que cria o baralho e embaralha ele, retornando-o.
     * @param qtdBaralho quantidade de baralhos escolhidos.
     * @return Baralho - retorna o baralho.
     */
    public Baralho criarBaralho(int qtdBaralho){
        ArrayList<Carta> cartas = iniciarBaralho(qtdBaralho);
        cartas = Embaralhar.embaralhar(cartas);
        return new Baralho(cartas, qtdBaralho);
    }

    /**
     * 
     * Método que inicia o baralho.
     * 
     * @param qtdBaralho
     * @return ArrayList<Carta>
     */
    private ArrayList<Carta> iniciarBaralho(int qtdBaralho){
        ArrayList<Carta> cartas = new ArrayList<Carta>(52*qtdBaralho);
        int quantidadeBaralho = 0;//quantidade de baralhos presente no jogo
        while(quantidadeBaralho < qtdBaralho){
            for(String naipe: naipes){//naipes do baralho
                int i = 0;
                for(String valor: valores){//valores presente do baralho
                    cartas.add(new Carta(naipe, valor, i));//criação de nova carta
                    i = i + 1;
                }
            }
            quantidadeBaralho++;
        } return cartas;
    }

}
