package controller;

import java.util.List;

import model.Carta;
import model.PilhaDescarte;
import model.PilhaEstoque;
import model.PilhaFileira;
import util.MoverCartas;


/**
 * Controller com funções para movimentações de cartas.
 * 
 *  @author Adlla Katarine e Daniel Alves
 */
public class ControllerMovimentos {
    private static final String FILEIRA = "FILEIRA"; 
    private static final String FUNDACAO = "FUNDACAO";
    private static final String NO_RULE = "NO_RULE";

    
    private ControllerMovimentos(){}

    
    /**
     * Método que move carta da pilha de estoque para a pilha de descarte.
     * 
     * @param estoque lista do estoque(será removido daqui)
     * @param descarte lista do descarte(será acrescentado aqui)
     * @param quantidadeMover quantidade de cartas que será movida
     */
    public static void moverEstoqueParaDescarte(List<Carta> estoque, List<Carta> descarte, int quantidadeMover) {
        MoverCartas.move(estoque, descarte, quantidadeMover, NO_RULE);
    }

    /**
     * Método que move a pilha de descarte para a pilha de estoque.
     * 
     * @param descarte lista do descarte(será removido daqui).
     * @param estoque lista do estoque(será acrescentado aqui).
     */
    public static void moverDescarteParaEstoque(PilhaDescarte descarte, PilhaEstoque estoque) {
        estoque.addEstoque(descarte.getPilha());
        descarte.clearDescarte();
    }

    /**
     * Método que move uma carta da pilha de descarte para uma das pilhas de fileiras.
     * 
     * @param descarte lista do descarte(será removido daqui).
     * @param fileira lista da fileira(será acrescentado aqui).
     */
    public static void moverCartaDescarteParaFileira(List<Carta> descarte, List<Carta> fileira) {
        MoverCartas.move(descarte, fileira, 1, FILEIRA);
    }

    /**
     * Método que move uma carta da pilha de descarte para uma das pilhas de fundação.
     * 
     * @param descarte lista do descarte(será removido daqui).
     * @param fundacao lista da fundacao(será acrescentado aqui).
     */
    public static void moverCartaDescarteParaFundacao(List<Carta> descarte, List<Carta> fundacao) {
        MoverCartas.move(descarte, fundacao, 1, FUNDACAO);
    }

    /**
     * Método que move uma carta da pilha de fundacao para uma das pilhas de fileira.
     * 
     * @param fundacao lista da fundacao(será removido daqui).
     * @param fileira lista da fileira(será acrescentado aqui).
     */
    public static void moverCartaFundacaoParaFileira(List<Carta> fundacao, List<Carta> fileira) {
        MoverCartas.move(fundacao, fileira, 1, FILEIRA);
    }

    /**
     * Método que move uma ou mais carta(s) de uma fileira para outra.
     * 
     * @param fileira1 lista da fileira que será removida as cartas(será removido daqui).
     * @param fileira2 lista da fileira que será acrescentada as cartas (será acrescentado aqui).
     * @param quantidadeMover quantidade de cartas que será movida.
     */
    public static void moverFileiraParaFileira(PilhaFileira fileira1, PilhaFileira fileira2, int quantidadeMover) {
        MoverCartas.moverFileira(fileira1, fileira2, quantidadeMover, FILEIRA);
    }

    /**
     * Método que move uma carta de uma fileira para uma fundação.
     * 
     * @param fileira lista da fileira(será removido daqui).
     * @param fundacao lista da fundacao(será acrescentado aqui).
     */
    public static void moverCartaFileiraParaFundacao(List<Carta> fileira, List<Carta> fundacao) {
        MoverCartas.move(fileira, fundacao, 1, FUNDACAO);
    }
}