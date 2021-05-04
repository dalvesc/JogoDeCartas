package model;


/**
 *
 * Classe para criação da carta do jogo.
 * 
 * @author Adlla Katarine e Daniel Alves
 */
public class Carta {
    public static final String ANSI_RESET = "\u001B[0m";//reseta a cor pro padrão
    public static final String ANSI_RED = "\u001B[31m";// transformar a cor da letra em vermelho
    public static final String ANSI_WHITE = "\u001B[37m";// transformar a cor da letra em branca
    private String cartaOculta = "[▒▒▒▒]";//modo de exibição quando a carta está virada
    private String naipe, valor, cor;
    private int peso;
    private boolean visivel;

    /**
     * Construtor da classe
     *
     * @param naipe naipe da carta
     * @param valor número da carta
     * @param cor   cor da carta
     * 
     */
    public Carta(String naipe, String valor, int peso) {
        this.naipe = naipe;
        this.valor = valor;
        this.peso = peso;
        this.visivel = false;
        setCor();
    }

    /**
     *
     * Define a cor da carta utilizando o naipe dela
     * 
     */
    private void setCor() {
        if (this.naipe.equals("♣") || this.naipe.equals("♠"))
            this.cor = "PRETO";
        else
            this.cor = "VERMELHO";
    }

    /**
     *
     * Retorna naipe do jogo
     * 
     * @return naipe da carta
     */
    public String getNaipe() {
        return naipe;
    }

    /**
     *
     * Retorna valor da carta
     * 
     * @return valor da carta
     */
    public String getValor() {
        return valor;
    }

    /**
     *
     * Retorna cor da carta
     * 
     * @param cor
     */
    public String getCor() {
        return cor;
    }

    /**
     *
     * Retorna peso da carta
     * 
     * @param peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     *
     * Retorna a visibilidade da carta
     * 
     * @return se ela está virada ou não
     */
    public boolean isVisivel() {
        return visivel;
    }

    /**
     *
     * Define a visibilidade da carta
     * 
     * @param face qual a visibilidade que quer definir
     */
    public void setVisivel(boolean face) {
        this.visivel = face;
    }

    
    /** 
     * 
     * Impressão da carta
     * 
     * @return String
     */
    @Override
    public String toString() {
        if(this.isVisivel()){
            if(this.cor.equals("VERMELHO"))
                return ANSI_RED + " [" + naipe +"  "+ valor +"  "+ naipe + "] " + ANSI_RESET;
            else
                return ANSI_WHITE + " [" + naipe +"  "+ valor +"  "+ naipe + "] " + ANSI_RESET;
        }else{
            return cartaOculta;
        }
    }
}
