package util;

import java.util.List;
import model.Carta;


/**
 *
 * Classe para exibir cartas de uma lista
 * falta comentar
 * @author Adlla Katarine e Daniel Alves
 */
public class MostrarCarta {

    private MostrarCarta(){}
    
    public static void mostrar(List<Carta> cartas, int quantidadeParaMostrar, boolean visivel){
        for(int i = 0; i < quantidadeParaMostrar; i++){
            cartas.get(cartas.size() - (i+1)).setVisivel(visivel);
        }
    }
}
