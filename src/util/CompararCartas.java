package util;

import model.Carta;


/**
 * Classe para comparar as cartas.
 * 
 * @author Adlla Katarine e Daniel Alves
 */
public class CompararCartas {

    private CompararCartas(){}

    
    /**
     * Método que compara os naipes e os pesos de duas cartas.
     * 
     * @return boolean - true forem do mesmo naipe e estiverem em ordem crescente.
     */
    private static boolean compararOrdemFundacao(Carta carta1, Carta carta2){
        return carta1.getNaipe().equals(carta2.getNaipe()) && compararPeso(carta1,carta2)==-1 && isVisivel(carta1, carta2);
    }

    /**
     * Método que compara as cores e os pesos de duas cartas.
     * 
     * @return boolean - true se forem de cores diferentes e estiverem em ordem decrescente.
     */
    private static boolean compararOrdemFileira(Carta carta1, Carta carta2){
        return !carta1.getCor().equals(carta2.getCor()) && compararPeso(carta1,carta2)==1 && isVisivel(carta1, carta2);
    }

    /**
     * Método que compara os pesos de duas cartas.
     * 
     * @return int - 1 se a diferença entre os pesos for diretamente decrescente(formação de fileira),
     *  -1 se a diferença diretamente crescente(formação de fundação) ou 0 se os pesos
     * forem iguais ou diferente dos anteriores(não podem se relacionar).
     */
    private static int compararPeso(Carta carta1, Carta carta2){
        if(carta2.getPeso()-carta1.getPeso()== 1){
            return 1;
        } else if(carta2.getPeso()-carta1.getPeso()== -1){
            return -1;
        } return 0;
    }

     /**
     * Método que verifica se pode mover a(s) carta(s) de acordo com as regras da fundação e da fileira.
     * 
     * @param carta1 
     * @param carta2
     * @param tipoPilha "FUNDACAO", "FILEIRA" OU "NO_RULE"
     * @return boolean - true se puder movimentar.
     */
    public static boolean podeMover(Carta carta1, Carta carta2, String tipoPilha){
        switch (tipoPilha) {
            case "FUNDACAO":
                return compararOrdemFundacao(carta1, carta2);
            case "FILEIRA":
                return compararOrdemFileira(carta1, carta2);
            case "NO_RULE":
                return true;
            default:
                return false;
        }
    }

    /**
     * Método que verifica se pode mover a(s) carta(s) para uma pilha vazia de acordo com as regras da
     * fundação e da fileira.
     * 
     * @param tipoPilha "FUNDACAO", "FILEIRA" OU "NO_RULE"
     * @param carta
     * @return boolean - true se puder movimentar.
     */
    public static boolean movimentarParaPilhaVazia(Carta carta, String tipoPilha){
        switch (tipoPilha) {
            case "FUNDACAO":
                return carta.getValor().equalsIgnoreCase("A");
            case "FILEIRA":
                return carta.getValor().equalsIgnoreCase("K");
            case "NO_RULE":
                return true;
            default:
                return false;
        }
    }

    /**
     * Verificar se as cartas estão viradas
     * 
     * @param carta1
     * @param carta2
     * @return true caso as duas estão viradas
     */
    private static boolean isVisivel(Carta carta1, Carta carta2){
        return carta1.isVisivel() && carta2.isVisivel();
    }
}