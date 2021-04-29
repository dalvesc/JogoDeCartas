package controller;

import java.util.ArrayList;
import java.util.List;
import model.Baralho;
import model.Carta;
import model.PilhaDescarte;
import model.PilhaEstoque;
import model.PilhaFileira;
import model.PilhaFundacao;

/**
 *
 * @author Adlla Katarine e Daniel Alves
 */
public class ControllerPaciencia {
    
    private Baralho baralho;
    private PilhaEstoque estoque;
    private PilhaDescarte descarte;
    private List<PilhaFundacao> fundacoes;
    private List<PilhaFileira> fileiras;
    private String cartaOculta = "[▒▒▒▒]"; 
    private static int quantidadeBaralhos = 1;  
    /**
     * 
     */
    public void iniciarBaralho(){
        baralho = new Baralho(quantidadeBaralhos);
    }
    
    public void embaralhar(){
        //baralho.embaralhar();
    }
    
    public void iniciarPilhas(){
        this.estoque = new PilhaEstoque();
        this.descarte = new PilhaDescarte();
        this.fundacoes = new ArrayList<>();
        this.fileiras = new ArrayList<>();
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
    
    /**
     * Método que distribui as cartas entre todas as fileiras.
     */
    public void distribuirCartasFileiras(){
        int qtdCartasDistribuidas = 1;
        for(PilhaFileira fileira: fileiras){
            
            for(int i=0; i<qtdCartasDistribuidas; i++){
                //fileira.addCarta(carta);
                if(i==qtdCartasDistribuidas-1){
                    //
                }
            }
        } qtdCartasDistribuidas++;
    }
    
    /**
     * Método que 
     */
    public void distribuirCartasEstoque(){
        
    }

    
}
