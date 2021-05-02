package model;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Adlla Katarine e Daniel Alves
 */
public class PilhaFundacao {
    private List<Carta> fundacao;

    public PilhaFundacao() {
        this.fundacao = new ArrayList<>();
    }

    public List<Carta> getCartasFundacao() {
        return fundacao;
    }
    
    /**
     * 
     * @param carta
     * @return
     */
    public void addCarta(Carta carta){
        this.fundacao.add(carta);
    }

    public Carta removerCarta(){
        return this.fundacao.remove(0);
    }

    @Override
    public String toString() {
        return fundacao.toString();
    }
}
