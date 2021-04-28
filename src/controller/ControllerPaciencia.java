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
    /**
     * 
     */
    public void iniciarBaralho(){
        baralho = new Baralho();
    }
    
    public void embaralhar(){
        baralho.embaralhar();
    }
    
    public void iniciarPilhas(){
        this.estoque = new PilhaEstoque(0);
        this.descarte = new PilhaDescarte();
        this.fundacoes = new ArrayList<>();
        this.fileiras = new ArrayList<>();
    }
    
    public void distribuirCartas(){
        for(PilhaFileira fileira: fileiras){
            
        }
        
        
    }
    
    
}
