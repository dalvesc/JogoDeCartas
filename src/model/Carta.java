public class Carta {
    
    private String naipe, valor, cor;
    private boolean face;

    /**
     * Construtor da classe
     *
     * @param naipe naipe da carta
     * @param valor número da carta
     * @param cor cor da carta
     * 
     */
    public Carta(String naipe, String valor, String cor) {
        this.naipe = naipe;
        this.valor = valor;
        this.cor = cor;
        this.face = false;
    }


    /**
     *
     * @return naipe da carta
     * 
     */
    public String getNaipe() {
        return naipe;
    }

    /**
     *
     * @return valor da carta
     * 
     */
    public String getValor() {
        return valor;
    }

    /**
     *
     * @return se ela está virada ou não
     * 
     */
    public boolean isFace() {
        return face;
    }

    /**
     *
     * @param face
     * 
     */
    public void setFace(boolean face) {
        this.face = face;
    } 
    
}
