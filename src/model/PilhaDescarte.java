package model;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Adlla Katarine e Daniel Alves
 */
public class PilhaDescarte {
    private List<Carta> descarte;

    public PilhaDescarte() {
        this.descarte = new ArrayList<>();
    }

    public List<Carta> getCartasDescarte() {
        return descarte;
    }
    
    public void addCarta(Carta carta){
        this.descarte.add(carta);
    }

    @Override
    public String toString() {
        return descarte.toString();
    }
}
