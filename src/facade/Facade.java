package facade;

import java.util.List;

import controller.ControllerMenu;
import controller.ControllerMovimentos;
import controller.ControllerPaciencia;
import model.*;


public class Facade {
    private ControllerMenu controllerMenu;
    private ControllerPaciencia controllerPaciencia;
    
    public Facade(int quantidadeBaralho){
        this.controllerMenu = new ControllerMenu(quantidadeBaralho);
        this.controllerPaciencia = new ControllerPaciencia(controllerMenu.getBaralhoEmbaralhado());
    }

    
    /** 
     * 
     * Método que define a quantidade de cartas movidas de vez da pilha de estoque para a pilha de descarte.
     * 
     * @param quantidade quantidade de cartas que irá exibir do estoque.
     * @return boolean - retorna se pode ou não exibir as cartas.
     */
    public boolean qtdVirarCartasEstoque(int quantidade){
        return controllerPaciencia.qtdVirarCartasEstoque(quantidade);
    }

    /** 
     * 
     * Exibir cartas da lista enviada.
     * 
     * @param cartas lista que quer exibir as cartas
     * @param quantidadeParaMostrar quantidade de cartas que quer mostras
     */
    public void mostrarCartas(List<Carta> cartas, int quantidadeParaMostrar){
        controllerPaciencia.mostrarCartas(cartas, quantidadeParaMostrar);
    }
    
    /** 
     * 
     * Retorna fileiras
     * 
     * @return List<PilhaFileira>
     */
    public List<PilhaFileira> getFileiras(){
        return controllerPaciencia.getFileiras();
    }

    /** 
     * 
     * Retorna estoque
     * 
     * @return PilhaEstoque
     */
    public PilhaEstoque getEstoque(){
        return controllerPaciencia.getEstoque();
    }

    /** 
     * 
     * Retorna fundação
     * 
     * @return List<PilhaFundacao>
     */
    public List<PilhaFundacao> getFundacao(){
        return controllerPaciencia.getFundacao();
    }

    /** 
     * 
     * Retorna descarte
     * 
     * @return PilhaDescarte
     */
    public PilhaDescarte getDescarte(){
        return controllerPaciencia.getDescarte();
    }

    /** 
     * 
     * Método que move carta da pilha de estoque para a pilha de descarte.
     * 
     * @param estoque lista do estoque(será removido daqui)
     * @param descarte lista do descarte(será acrescentado aqui)
     * @param quantidadeMover quantidade de cartas que será movida
     */
    public void moverEstoqueParaDescarte(List<Carta> estoque, List<Carta> descarte, int quantidadeMover) {
        ControllerMovimentos.moverEstoqueParaDescarte(estoque, descarte, quantidadeMover);
    }
    
    /** 
     * 
     * Método que move a pilha de descarte para a pilha de estoque.
     * 
     * @param descarte lista do descarte(será removido daqui).
     * @param estoque lista do estoque(será acrescentado aqui).
     */
    public void moverDescarteParaEstoque(PilhaDescarte descarte, PilhaEstoque estoque) {
        ControllerMovimentos.moverDescarteParaEstoque(descarte, estoque);
    }

    /** 
     * 
     * Método que move uma carta da pilha de descarte para uma das pilhas de fileiras.
     * 
     * @param descarte lista do descarte(será removido daqui).
     * @param fileira lista da fileira(será acrescentado aqui).
     */
    public void moverCartaDescarteParaFileira(List<Carta> descarte, List<Carta> fileira) {
        ControllerMovimentos.moverCartaDescarteParaFileira(descarte, fileira);
    }

    /** 
     * 
     * Método que move uma carta da pilha de descarte para uma das pilhas de fundação.
     * 
     * @param descarte lista do descarte(será removido daqui).
     * @param fundacao lista da fundacao(será acrescentado aqui).
     */
    public void moverCartaDescarteParaFundacao(List<Carta> descarte, List<Carta> fundacao) {
        ControllerMovimentos.moverCartaDescarteParaFundacao(descarte, fundacao);
    }
    
    /** 
     * 
     * Método que move uma carta da pilha de fundacao para uma das pilhas de fileira.
     * 
     * @param fundacao lista da fundacao(será removido daqui).
     * @param fileira lista da fileira(será acrescentado aqui).
     */
    public void moverCartaFundacaoParaFileira(List<Carta> fundacao, List<Carta> fileira) {
        ControllerMovimentos.moverCartaFundacaoParaFileira(fundacao, fileira);
    }
    
    /** 
     * 
     * Método que move uma ou mais carta(s) de uma fileira para outra.
     * 
     * @param fileira1 lista da fileira que será removida as cartas(será removido daqui).
     * @param fileira2 lista da fileira que será acrescentada as cartas (será acrescentado aqui).
     * @param quantidadeMover quantidade de cartas que será movida.
     */
    public void moverFileiraParaFileira(PilhaFileira fileira1, PilhaFileira fileira2, int quantidadeMover){
        ControllerMovimentos.moverFileiraParaFileira(fileira1, fileira2, quantidadeMover);
    }
    
    /** 
     * 
     * Método que move uma carta de uma fileira para uma fundação.
     * 
     * @param fileira lista da fileira(será removido daqui).
     * @param fundacao lista da fundacao(será acrescentado aqui).
     */
    public void moverCartaFileiraParaFundacao(List<Carta> fileira, List<Carta> fundacao){
        ControllerMovimentos.moverCartaFileiraParaFundacao(fileira, fundacao);
    }
    
    /** 
     * 
     * Método que verifica se o jogo foi ganho, conferindo se toda as pilhas de fundações estão completas (com 13
     * cartas cada).
     * 
     * @return boolean - true se todas as pilhas estiverem completas.
     */
    public boolean verificarJogoGanho(){
        return controllerPaciencia.verificarJogoGanho();
    }
}
