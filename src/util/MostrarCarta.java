package util;

import java.util.List;
import model.Carta;


/**
 *
 * Classe para exibir cartas de uma lista
 * falta comentar
 * 
 * @author Adlla Katarine e Daniel Alves
 */
public class MostrarCarta {

    private MostrarCarta(){}
    
    /**
     * 
     * Método que oculta ou mostra a(s) carta(s) de uma pilha.
     * 
     * @param cartas lista de cartas.
     * @param quantidadeParaMostrar quantidade cartas que serão ocultadas ou mostradas.
     * @param visivel boolean - define se as cartas serão ocultadas(false) ou mostradas(true).
     */
    public static void mostrar(List<Carta> cartas, int quantidadeParaMostrar, boolean visivel){
        for(int i = 0; i < quantidadeParaMostrar; i++){
            cartas.get(cartas.size() - (i+1)).setVisivel(visivel);
        }
    }
}
