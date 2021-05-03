package model;

import java.util.List;


/**
 *
 * @author Adlla Katarine e Daniel Alves
 */
public class PilhaFileira extends Pilha{

    public PilhaFileira() {
        super();
    }

    public void addCartasDeOutraFileira(List<Carta> otherFileira){
        this.pilha.addAll(otherFileira);
    }
}
