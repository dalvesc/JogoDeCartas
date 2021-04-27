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

    public List<Carta> getDescarte() {
        return descarte;
    }
    
    public void addCarta(Carta carta){
        this.descarte.add(carta);
    }
    
    public void moverPilhaEstoque(){
        
    }
    
    public void moverCartaFundacao(){
        
    }
    
    public void moverCartaFileira(){
        
    }
}
