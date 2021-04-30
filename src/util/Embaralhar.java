package util;

import java.util.ArrayList;
import java.util.Collections;
import model.Carta;


/**
 *
 * @author Adlla Katarine e Daniel Alves
 */
public class Embaralhar {
    
    private Embaralhar() {
    }

    public static ArrayList<Carta> embaralhar(ArrayList<Carta> baralho){
        Collections.shuffle(baralho);
        return baralho;
    }
}
