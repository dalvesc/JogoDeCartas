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

    public void addCartas(List<Carta> OtherFileira){
        this.fileira.addAll(OtherFileira);
    }

    public Carta removerCarta(){
        return this.fileira.remove(0);
    }
    
    @Override
    public String toString() {
        return fileira.toString();
    }
}
