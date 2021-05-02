package util;

//import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;
import model.Carta;
//import model.PilhaFileira;


/**
 * Classe responsável pela movimentação das cartas
 *
 * @author Adlla Katarine e Daniel Alves
 */
public class MoverCartas {

    private MoverCartas(){}

    /**
     * 
     * Função para movimentação entre cartas
     * 
     * @param cartas1 de onde será retirado a(s) carta(s)
     * @param cartas2 de onde será acrescentado a(s) carta(s)
     * @param quantidadeMover quantidade de cartas para mover
     * 
     */
    public static void move(List<Carta> cartas1, List<Carta> cartas2, int quantidadeMover, String pilha){
        boolean movimentar = false;
        if(!cartas1.isEmpty()){
            for(int i = 0; i < quantidadeMover; i++){
                if(!cartas2.isEmpty()){
                    if(podeMover(cartas1.get(cartas1.size()-quantidadeMover), cartas2.get(cartas2.size()-1), pilha)){
                        movimentar = true;
                    }
                } else{
                    if(movimentarParaPilhaVazia(pilha, cartas1.get(cartas1.size()-1))){
                        movimentar = true;
                    }
                }

                if(movimentar){
                    cartas2.add(cartas1.remove(cartas1.size() - 1));
                }
            }
        }
    }

    /**public static void moveO(List<Carta> cartas1, List<Carta> cartas2, int quantidadeMover, String pilha){
        for(int i = 0; i < quantidadeMover; i++){
            if(podeMover(cartas1.get(cartas1.size()-quantidadeMover), cartas2.get(cartas2.size()-1), pilha)){
                cartas2.add(cartas1.remove(cartas1.size() - 1));
            }
        }
    }

    public static void moverFileira(PilhaFileira fileira1, PilhaFileira fileira2, int quantidadeMover, String pilha){
        List<Carta> fileiraAux = new ArrayList<Carta>();
        for (int i = 0; i < quantidadeMover; i++) {
            if(podeMover(cartas1.get(cartas1.size()-quantidadeMover), cartas2.get(cartas2.size()-1), pilha))
            fileiraAux.add(fileira1.getCartasFileira().remove(fileira1.getCartasFileira().size() - 1));
        } Collections.reverse(fileiraAux);
        fileira2.addCartas(fileiraAux);
    }*/

    /**
     * Método que verifica se pode mover a(s) carta(s) de acordo com as regras da fundação e da fileira.
     * @param carta1
     * @param carta2
     * @param pilha "FUNDACAO", "FILEIRA" OU "NO_RULE"
     * @return true se puder movimentar.
     */
    private static boolean podeMover(Carta carta1, Carta carta2, String pilha){
        switch (pilha) {
            case "FUNDACAO":
                return new ComparacaoCartas(carta1, carta2).compararOrdemFundacao();
            case "FILEIRA":
                return new ComparacaoCartas(carta1, carta2).compararOrdemFileira();
            case "NO_RULE":
                return true;
            default:
                return false;
        }
    }

    /**
     * Método que verifica se pode mover a(s) carta(s) para uma pilha vazia de acordo com as regras da
     * fundação e da fileira.
     * @param pilha
     * @param carta
     * @return true se puder movimentar.
     */
    public static boolean movimentarParaPilhaVazia(String pilha, Carta carta){
        switch (pilha) {
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
}
