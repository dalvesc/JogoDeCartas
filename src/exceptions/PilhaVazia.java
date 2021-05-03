package exceptions;

/**
 * 
 * Caso a pilha esteja vazia
 * 
 * @author Adlla Katarine e Daniel Alves
*/
public class PilhaVazia extends Exception {
    public static final String ANSI_CYAN = "\u001B[36m";// transformar a cor da letra em ciano
    public static final String ANSI_RESET = "\u001B[0m";//reseta a cor pro padrão

    public PilhaVazia(){
        super(ANSI_CYAN + "Pilha está vazia." + ANSI_RESET);
    }
}
