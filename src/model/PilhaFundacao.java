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

    public List<Carta> getFundacao() {
        return fundacao;
    }
    
    /**
     * 
     * @param carta
     * @return
     */
    public boolean addCarta(Carta carta){
        if(verificarOrdem()){
            return this.fundacao.add(carta);
        } return false;
    }
    
    public void moverCartaFileira(){
        
    }
    
    public boolean verificarOrdem(){
        return false;
    }

    @Override
    public String toString() {
        return fundacao.toString();
    }
}
