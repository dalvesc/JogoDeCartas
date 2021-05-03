package model;

import java.util.List;


/**
 *
 * @author Adlla Katarine e Daniel Alves
 */
public class PilhaFileira extends Pilha{
    private List<Carta> fileira;

    public PilhaFileira() {
        super();
    }

    public void addCartasDeOutraFileira(List<Carta> OtherFileira){
        this.fileira.addAll(OtherFileira);
    }
}
