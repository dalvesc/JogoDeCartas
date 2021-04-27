package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adlla Katarine e Daniel Alves
 */
public class PilhaEstoque {
    private List<Carta> estoque;
    private int qtdCartasMovidas;

    public PilhaEstoque() {
        this.estoque = new ArrayList<>();
    }

    public List<Carta> getEstoque() {
        return estoque;
    }

    public void setQtdCartasMovidas(int qtdCartasMovidas){
        this.qtdCartasMovidas = qtdCartasMovidas;
    }

    public void addEstoque(List<Carta> estoque) {
        this.estoque = estoque;
    }
    
    public void addCarta(Carta carta){
        this.estoque.add(carta);
    }
    
    public void moverCarta(){
        for(int i =0; i<qtdCartasMovimentadas; i++){
            if(!estoque.isEmpty()){
                estoque.remove(estoque.size()-1);
            }
        }
    }
}
