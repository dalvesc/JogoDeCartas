package model;

import java.util.List;


/**
 *
 * Classe que estende da classe abstrata Pilha.
 * 
 * @author Adlla Katarine e Daniel Alves
 */
public class PilhaFileira extends Pilha{

    public PilhaFileira() {
        super();
    }

    
    /** 
     * 
     * Adiciona todas as cartas de uma fileira em outra.
     * 
     * @param otherFileira cartas da outra fileira que quer adicionar.
     */
    public void addCartasDeOutraFileira(List<Carta> otherFileira){
        this.pilha.addAll(otherFileira);
    }
}
