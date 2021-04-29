package controller;

import java.util.ArrayList;
import java.util.List;
import model.*;

/**
 *
 * @author Adlla Katarine e Daniel Alves
 */
public class ControllerPaciencia{
    private PilhaEstoque estoque;
    private PilhaDescarte descarte;
    private List<PilhaFundacao> fundacoes;
    private List<PilhaFileira> fileiras;
    private List<Carta> baralho;
    private ControllerMovimentos movimentos = new ControllerMovimentos();
    private String cartaOculta = "[▒▒▒▒]"; 
 

    public ControllerPaciencia(ArrayList<Carta> baralho){
        this.baralho = baralho;
        this.estoque = new PilhaEstoque();
        this.descarte = new PilhaDescarte();
        this.fundacoes = new ArrayList<>(4);
        this.fileiras = new ArrayList<>(7);
        distribuirCartasFileiras();
        addCartasEstoque();
    }

    /**
     * Método que define a quantidade de cartas movidas de vez da pilha de estoque para a pilha de descarte.
     * 
     * @param quantidade
     * @return boolean 
     */
    public boolean qtdVirarCartasEstoque(int quantidade){
        if(quantidade==1 || quantidade==3){
            this.estoque.setQtdCartasMovidas(quantidade);
            return true;
        } return false;
    }


    public List<PilhaFileira> getFileiras(){
        return fileiras;
    }

    public PilhaEstoque getEstoque(){
        return estoque;
    }

    public List<PilhaFundacao> getFundacao(){
        return fundacoes;
    }

    public PilhaDescarte getDescarte(){
        return descarte;
    }

    public void ocultarCartas(){

    }

    public void informarPilhasVazias(){
        
    }
    
    /**
     * Método que distribui as cartas entre todas as fileiras.
     */
    public void distribuirCartasFileiras(){
        int qtdCartasDistribuidas = 1;
        for(int i=0; i<fileiras.size(); i++){
            PilhaFileira fileira = new PilhaFileira();
            for(int j=0; j<qtdCartasDistribuidas; j++){
                if(j==qtdCartasDistribuidas-1){
                    this.baralho.get(0).setVisivel(true);
                }
                fileira.addCarta(this.baralho.remove(0));
            }
            this.fileiras.add(fileira);
            qtdCartasDistribuidas++;
        }
    }

    
    /**
     * Método que adiciona as cartas restantes no baralho ao estoque.
     */
    public void addCartasEstoque(){
        estoque.addEstoque(this.baralho);
        this.baralho.clear();
    }

    public void movimentarCartas(){
    }
}
