package model;

/**
 *
 * Classe que estende da classe abstrata Pilha.
 * 
 * @author Adlla Katarine e Daniel Alves
 */
public class PilhaDescarte extends Pilha{

    public PilhaDescarte() {
        super();
    }

    /**
     * 
     * Método que apaga todas as cartas da pilha.
     * 
     */
    public void clearDescarte(){
        this.pilha.clear();
    }
}
