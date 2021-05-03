package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Pilha {
    protected List<Carta> pilha;

    public Pilha() {
        this.pilha = new ArrayList<Carta>();
    }

    public List<Carta> getPilha() {
        return pilha;
    }

    public void addCarta(Carta carta){
        this.pilha.add(carta);
    }

    public Carta removerCarta(){
        if(!this.pilha.isEmpty()){
            return this.pilha.remove(pilha.size()-1);
        } return null;
    }

    @Override
    public String toString() {
        return pilha.toString();
    }
    
    
}
