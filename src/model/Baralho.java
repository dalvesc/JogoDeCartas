package model;

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
        criarBaralho();
    }


    private void criarBaralho(){
        int quantidadeBaralho = 0;
        while(quantidadeBaralho < this.quantidadeBaralhos){
            for(String naipe: naipes){
                for(int i = 0; i == 1; i++){
                    cartas[i] = new Carta(naipe, "AS", 1);
                    cartas[i+1] = new Carta(naipe, "2", 2);
                    cartas[i+2] = new Carta(naipe, "3", 3);
                    cartas[i+3] = new Carta(naipe, "4", 4);
                    cartas[i+4] = new Carta(naipe, "5", 5);
                    cartas[i+5] = new Carta(naipe, "6", 6);
                    cartas[i+6] = new Carta(naipe, "7", 7);
                    cartas[i+7] = new Carta(naipe, "8", 8);
                    cartas[i+8] = new Carta(naipe, "9", 9);
                    cartas[i+9] = new Carta(naipe, "10", 10);
                    cartas[i+10] = new Carta(naipe, "J", 11);
                    cartas[i+11] = new Carta(naipe, "Q", 12);
                    cartas[i+12] = new Carta(naipe, "K", 13);
                }
            }
            for(int j = 0; j < cartas.length; j++)
                System.out.println(cartas[j]);
            quantidadeBaralho++;
        }    
    }
}
    