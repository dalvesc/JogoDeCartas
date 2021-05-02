package model;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Adlla Katarine e Daniel Alves
 */
public class PilhaFileira {
    private List<Carta> fileira;

    public PilhaFileira() {
        this.fileira = new ArrayList<>();
    }

    public List<Carta> getCartasFileira() {
        return fileira;
    }
    
    public void addCarta(Carta carta){
        this.fileira.add(carta);
    }
    
    @Override
    public String toString() {
        return fileira.toString();
    }
}
