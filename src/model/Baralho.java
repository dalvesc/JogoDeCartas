public class Baralho {
    
    private int quantidadeBaralhos;
    private Carta[] cartas = new Carta[52];
    private final String[] naipes = {"♣", "♥", "♠", "♦"};
    
    /**
     * Construtor da classe
     *
     * @param quantidadeBaralhos quantidade da baralhos do jogo
     * 
     */
    public Baralho(int quantidadeBaralhos) {
        this.quantidadeBaralhos = quantidadeBaralhos;
        criaBaralho();
    }


    private void criaBaralho(){
        for(int i = 0; i < 12; i++){
            for(String naipe: naipes){
                System.out.println(naipe);
            }
        }
    }    
}
    