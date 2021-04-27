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
    
    public void addCarta(Carta carta){
        this.fundacao.add(carta);
    }
    
    public void moverCartaFileira(){
        
    }
    
    public void verificarOrdem(){
        
    }
}
