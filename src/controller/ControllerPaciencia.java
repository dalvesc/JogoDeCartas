package controller;

import java.util.ArrayList;
import java.util.List;
import model.*;
import util.MostrarCarta;

/**
 * 
 * Controller para funções do jogo Paciência.
 * 
 * @author Adlla Katarine e Daniel Alves
 */
public class ControllerPaciencia{
    private PilhaEstoque estoque;//estoque de cartas do jogo 
    private PilhaDescarte descarte;//descarte de cartas do jogo 
    private List<PilhaFundacao> fundacoes;//lista de fundações do jogo
    private List<PilhaFileira> fileiras;//lista de fileiras do jogo
    private List<Carta> baralho;//baralho do jogo
 

    public ControllerPaciencia(ArrayList<Carta> baralho){
        this.baralho = baralho;
        this.estoque = new PilhaEstoque();
        this.descarte = new PilhaDescarte();
        this.fundacoes = new ArrayList<>(4);
        this.fileiras = new ArrayList<>(7);
        distribuirCartasFileiras();
        criarFundacoesVazias();
        addCartasEstoque();
    }


    /**
     * 
     * Método que distribui as cartas entre todas as fileiras.
     * 
     */
    private void distribuirCartasFileiras(){
        int qtdCartasDistribuidas = 1;
        for(int i=0; i<7; i++){
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
     * 
     * Método que cria as pilhas de fundações vazias.
     * 
     */
    private void criarFundacoesVazias(){
        for (int i=0; i<4; i++) {
            PilhaFundacao fundacao = new PilhaFundacao();
            this.fundacoes.add(fundacao);
        }
    }

    /**
     * 
     * Método que adiciona as cartas restantes no baralho ao estoque.
     * 
     */
    private void addCartasEstoque(){
        this.estoque.addEstoque(this.baralho);
        this.baralho.clear();
    }

    /**
     * 
     * Método que define a quantidade de cartas movidas de vez da pilha de estoque para a pilha de descarte.
     *
     * @param quantidade quantidade de cartas que irá exibir do estoque.
     * @return boolean - retorna se pode ou não exibir as cartas.
     */
    public boolean qtdVirarCartasEstoque(int quantidade){
        if(quantidade==1 || quantidade==3){
            return this.estoque.setQtdCartasMovidas(quantidade);
        } 
        return false;
    }

    /**
     * 
     * Exibir cartas da lista enviada.
     * 
     * @param cartas lista que quer exibir as cartas
     * @param quantidadeParaMostrar quantidade de cartas que quer mostras
     */
    public void mostrarCartas(List<Carta> cartas, int quantidadeParaMostrar){
        MostrarCarta.mostrar(cartas, quantidadeParaMostrar, true);
    }

    /**
     * 
     * Método que retorna uma List com as pilhas de fileira.
     * 
     * @return List<PilhaFileira>.
     */
    public List<PilhaFileira> getFileiras(){
        return this.fileiras;
    }

    /**
     * 
     * Método que retorna a pilha de estoque.
     * 
     * @return PilhaEstoque da carta.
     */
    public PilhaEstoque getEstoque(){
        return this.estoque;
    }

    /**
     * 
     * Método que retorna uma List com as pilhas de fundação.
     * 
     * @return List<PilhaFundacao>
     */
    public List<PilhaFundacao> getFundacao(){
        return this.fundacoes;
    }

    /**
     * 
     * Método que retorna a pilha de descarte.
     * 
     * @return PilhaDescarte da carta.
     */
    public PilhaDescarte getDescarte(){
        return descarte;
    }

    /**
     * 
     * Método que verifica se o jogo foi ganho, conferindo se toda as pilhas de fundações estão completas (com 13
     * cartas cada).
     * 
     * @return boolean - true se todas as pilhas estiverem completas.
     */
    public boolean verificarJogoGanho(){
        for (PilhaFundacao fundacao : this.fundacoes) {
            if(fundacao.getPilha().size()<13){
                return false;
            }
        } return true;
    }
}
