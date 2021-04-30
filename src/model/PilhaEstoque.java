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
        this.qtdCartasMovidas = 1;
    }

    public List<Carta> getCartasEstoque() {
        return estoque;
    }

    public boolean setQtdCartasMovidas(int qtdCartasMovidas){
        if(qtdCartasMovidas <= estoque.size()){
        this.qtdCartasMovidas = qtdCartasMovidas;
        return true;
        }
        return false;
    }

    public void addEstoque(List<Carta> estoque) {
        this.estoque.addAll(estoque);
    }
    
    /**public void addCarta(Carta carta){
        this.estoque.add(carta);
    }*/
    
    public void moverCarta(){
        for(int i =0; i<qtdCartasMovidas; i++){
            if(!estoque.isEmpty()){
                estoque.remove(estoque.size()-1);
            }
        }
    }

    @Override
    public String toString() {
        return estoque.toString();
    }
}
