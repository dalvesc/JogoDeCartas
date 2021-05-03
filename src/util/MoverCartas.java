package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Carta;
import model.PilhaFileira;


/**
 * 
 * Classe responsável pela movimentação das cartas
 *
 * @author Adlla Katarine e Daniel Alves
 * 
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
    public static void move(List<Carta> cartas1, List<Carta> cartas2, int quantidadeMover, String tipoPilha){
        boolean movimentar = false;
        if(!cartas1.isEmpty()){
            for(int i = 0; i < quantidadeMover; i++){
                if(!cartas2.isEmpty()){
                    if(ComparacaoCartas.podeMover(cartas1.get(cartas1.size()-quantidadeMover), cartas2.get(cartas2.size()-1), tipoPilha)){
                        movimentar = true;
                    }
                } else{
                    if(ComparacaoCartas.movimentarParaPilhaVazia(cartas1.get(cartas1.size()-1), tipoPilha)){
                        movimentar = true;
                    }
                }
                if(movimentar){
                    cartas2.add(cartas1.remove(cartas1.size() - 1));
                }
            }
        }
    }

    public static void moverFileira(PilhaFileira fileira1, PilhaFileira fileira2, int quantidadeMover, String tipoPilha){
        boolean movimentar = false;
        List<Carta> fileiraAux = new ArrayList<Carta>();
        if(!fileira1.getCartasFileira().isEmpty()){
           if(!fileira2.getCartasFileira().isEmpty()) {
               if(ComparacaoCartas.podeMover(fileira1.getCartasFileira().get(quantidadeMover), fileira2.getCartasFileira().get(fileira2.getCartasFileira().size()-1) , tipoPilha)){
                movimentar = true;
                }
           } else{
                if(ComparacaoCartas.movimentarParaPilhaVazia(fileira1.getCartasFileira().get(quantidadeMover), tipoPilha)){
                    movimentar = true;
                }
        } if(movimentar){
            int tamanhoListaRemover = fileira1.getCartasFileira().size();
            for (int i = quantidadeMover; i < tamanhoListaRemover; i++) {
                fileiraAux.add(fileira1.removerCarta());
            }
            Collections.reverse(fileiraAux);
            fileira2.addCartas(fileiraAux);
            }
        } 
    }
}