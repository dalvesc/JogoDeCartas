package util;

import java.util.ArrayList;
import java.util.Collections;
import model.Carta;


public class Embaralhar {
    
    private Embaralhar() {
    }

    public static ArrayList<Carta> embaralhar(ArrayList<Carta> baralho){
        Collections.shuffle(baralho);
        return baralho;
    }
}
