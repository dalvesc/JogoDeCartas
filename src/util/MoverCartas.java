package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Carta;
import model.PilhaFileira;


/**
 * 
 * Classe responsável pela movimentação das cartas.
 *
 * @author Adlla Katarine e Daniel Alves
 */
public class MoverCartas {

    private MoverCartas(){}


    /**
     * 
     * Método que faz a movimentação de uma carta entre pilhas distintas ou de uma ou três cartas do estoque para
     * o descarte.
     * Também são feitas verificações se as cartas obedecem as regras de movimento das fileiras e fundações.
     * 
     * @param cartas1 de onde será retirado a(s) carta(s)
     * @param cartas2 para onde será acrescentado a(s) carta(s)
     * @param quantidadeMover quantidade de cartas para mover
     * @param tipoPilha define de qual pilha será verificada as de movimentação das cartas.
     */
    public static void move(List<Carta> cartas1, List<Carta> cartas2, int quantidadeMover, String tipoPilha) {
        boolean movimentar = false; // true caso obedeça a uma das regras de movimento das fileiras ou fundações.
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

    /**
     * Método que move carta(s) de uma fileira para outra. É criado um ArrayList auxiliar, onde são adicionadas
     * as cartas que serão movidas para facilitar move-las na ordem correta.
     * Também são feitas verificações se as cartas obedecem as regras de movimento das fileiras.
     * 
     * @param fileira1 de onde será retirado a(s) carta(s)
     * @param fileira2 para onde será acrescentado a(s) carta(s)
     * @param quantidadeMover quantidade de cartas visíveis para mover.
     * @param tipoPilha define de qual pilha será verificada as de movimentação das cartas.
     */
    public static void moverFileira(PilhaFileira fileira1, PilhaFileira fileira2, int quantidadeMover, String tipoPilha){
        boolean movimentar = false; // true caso obedeça a uma das regras de movimento das fileiras.
        List<Carta> fileiraAux = new ArrayList<Carta>();
        if(!fileira1.getPilha().isEmpty()){
           if(!fileira2.getPilha().isEmpty()) {
               if(ComparacaoCartas.podeMover(fileira1.getPilha().get(quantidadeMover), fileira2.getPilha().get(fileira2.getPilha().size()-1) , tipoPilha)){
                movimentar = true;
                }
           } else{
                if(ComparacaoCartas.movimentarParaPilhaVazia(fileira1.getPilha().get(quantidadeMover), tipoPilha)){
                    movimentar = true;
                }
        } if(movimentar){
            int tamanhoListaRemover = fileira1.getPilha().size();
            for (int i = quantidadeMover; i < tamanhoListaRemover; i++) {
                fileiraAux.add(fileira1.removerCarta());
            }
            Collections.reverse(fileiraAux);
            fileira2.addCartasDeOutraFileira(fileiraAux);
            }
        }
    }
}