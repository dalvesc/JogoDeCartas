package util;

import java.util.List;
import model.Carta;


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
    public static void move(List<Carta> cartas1, List<Carta> cartas2, int quantidadeMover){
        for(int i = 0; i < quantidadeMover; i++){
            cartas2.add(cartas1.remove(cartas1.size() - 1));
        }
    }
    
}
