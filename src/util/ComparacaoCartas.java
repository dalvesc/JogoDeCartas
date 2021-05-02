package util;

import model.Carta;


/**
 * 
 * Classe para comparar as cartas 
 * 
 * @author Adlla Katarine e Daniel Alves
 */
public class ComparacaoCartas {
    private Carta carta1, carta2;

    public ComparacaoCartas(Carta carta_1, Carta carta_2){
        carta1 = carta_1;
        carta2 = carta_2;
    }

    /**
     * Método que compara os naipes e os pesos de duas cartas.
     * @return true forem do mesmo naipe e estiverem em ordem crescente.
     */
    public boolean compararOrdemFundacao(){
        return carta1.getNaipe().equals(carta2.getNaipe()) && compararPeso()==-1;
    }


    /**
     * Método que compara as cores e os pesos de duas cartas.
     * @return true se forem de cores diferentes e estiverem em ordem decrescente.
     */
    public boolean compararOrdemFileira(){
        return !carta1.getCor().equals(carta2.getCor()) && compararPeso()==1;
    }

    /**
     * Método que compara os pesos de duas cartas.
     * @return 1 se a diferença entre os pesos for de valor 1, -1 se a diferença tiver esse valor ou 0 se os pesos
     * forem iguais ou diferente dos anteriores.
     */
    private int compararPeso(){
        if(carta2.getPeso()-carta1.getPeso()== 1){
            return 1;
        } else if(carta2.getPeso()-carta1.getPeso()== -1){
            return -1;
        } return 0;
    }
}
