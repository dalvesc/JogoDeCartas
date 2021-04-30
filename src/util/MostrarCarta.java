package util;

import java.util.List;
import model.Carta;


/**
 *
 * @author Adlla Katarine e Daniel Alves
 */
public class MostrarCarta {

    private MostrarCarta(){}
    
    public static void mostrar(List<Carta> cartas, int quantidadeParaMostrar){
        for(int i = 0; i < quantidadeParaMostrar; i++){
            cartas.get(cartas.size() - (i+1)).setVisivel(true);
        }
    }
}
