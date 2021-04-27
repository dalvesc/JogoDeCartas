package util;

import java.util.ArrayList;
import java.util.Collections;
import model.Carta;


public class Embaralhar {
    private ArrayList<Carta> baralho;

    public Embaralhar(ArrayList<Carta> baralho) {
        this.baralho = baralho;
    }
    
    public ArrayList<Carta> embaralhar(){
        Collections.shuffle(this.baralho);
        return this.baralho;
    }
}
