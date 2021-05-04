package model;

import java.util.ArrayList;
import java.util.List;


/**
 * Classe abstrata para a criação das pilhas.
 * 
 * @author Adlla Katarine e Daniel Alves
 */
public abstract class Pilha {
    protected List<Carta> pilha;

    public Pilha() {
        this.pilha = new ArrayList<Carta>();
    }

    
    /** 
     * 
     * Método que retorna a List de cartas.
     * 
     * @return List<Carta>
     */
    public List<Carta> getPilha() {
        return pilha;
    }

    /** 
     * 
     * Método que adiciona uma carta na pilha.
     * 
     * @param carta
     */
    public void addCarta(Carta carta){
        this.pilha.add(carta);
    }

    /** 
     * 
     * Método que remove a última carta da pilha, retornando-a.
     * 
     * @return Carta
     */
    public Carta removerCarta(){
        if(!this.pilha.isEmpty()){
            return this.pilha.remove(pilha.size()-1);
        } return null;
    }

    /** 
     * 
     * Método que retorna o toString da pilha.
     * 
     * @return String
     */
    @Override
    public String toString() {
        return pilha.toString();
    }  
}
