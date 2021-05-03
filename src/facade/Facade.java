package facade;

import java.util.List;

import controller.ControllerMenu;
import controller.ControllerMovimentos;
import controller.ControllerPaciencia;
import model.Carta;
import model.PilhaDescarte;
import model.PilhaEstoque;
import model.PilhaFileira;
import model.PilhaFundacao;

public class Facade {
    private ControllerMenu controllerMenu;
    private ControllerPaciencia controllerPaciencia;
    
    public Facade(int quantidadeBaralho){
        this.controllerMenu = new ControllerMenu(quantidadeBaralho);
        this.controllerPaciencia = new ControllerPaciencia(controllerMenu.getBaralhoEmbaralhado());
    }

    public boolean qtdVirarCartasEstoque(int quantidade){
        return controllerPaciencia.qtdVirarCartasEstoque(quantidade);
    }

    public void mostrarCartas(List<Carta> cartas, int quantidadeParaMostrar){
        controllerPaciencia.mostrarCartas(cartas, quantidadeParaMostrar);
    }
    
    public List<PilhaFileira> getFileiras(){
        return controllerPaciencia.getFileiras();
    }

    public PilhaEstoque getEstoque(){
        return controllerPaciencia.getEstoque();
    }

    public List<PilhaFundacao> getFundacao(){
        return controllerPaciencia.getFundacao();
    }

    public PilhaDescarte getDescarte(){
        return controllerPaciencia.getDescarte();
    }

    public void moverEstoqueParaDescarte(List<Carta> estoque, List<Carta> descarte, int quantidadeMover) {
        ControllerMovimentos.moverEstoqueParaDescarte(estoque, descarte, quantidadeMover);
    }
    
    public void moverDescarteParaEstoque(PilhaDescarte descarte, PilhaEstoque estoque) {
        ControllerMovimentos.moverDescarteParaEstoque(descarte, estoque);
    }

    public void moverCartaDescarteParaFileira(List<Carta> descarte, List<Carta> fileira) {
        ControllerMovimentos.moverCartaDescarteParaFileira(descarte, fileira);
    }

    public void moverCartaDescarteParaFundacao(List<Carta> descarte, List<Carta> fundacao) {
        ControllerMovimentos.moverCartaDescarteParaFundacao(descarte, fundacao);
    }

    public void moverCartaFundacaoParaFileira(List<Carta> fundacao, List<Carta> fileira) {
        ControllerMovimentos.moverCartaFundacaoParaFileira(fundacao, fileira);
    }

    public void moverFileiraParaFileira(PilhaFileira fileira1, PilhaFileira fileira2, int quantidadeMover){
        ControllerMovimentos.moverFileiraParaFileira(fileira1, fileira2, quantidadeMover);
    }
                    

    public void moverCartaFileiraParaFundacao(List<Carta> fileira, List<Carta> fundacao){
        ControllerMovimentos.moverCartaFileiraParaFundacao(fileira, fundacao);
    }

    public boolean verificarJogoGanho(){
        return controllerPaciencia.verificarJogoGanho();
    }
}
