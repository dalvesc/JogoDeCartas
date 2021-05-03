package exceptions;

/**
 * 
 * Caso o usuário tente fazer uma ação proibida(mover carta que não pode,
 * escolher opção que não existe).
 * 
 * @author Adlla Katarine e Daniel Alves
*/
public class AcaoProibida extends Exception {

    public static final String ANSI_CYAN = "\u001B[36m";// transformar a cor da letra em ciano
    public static final String ANSI_RESET = "\u001B[0m";//reseta a cor pro padrão

    @Override
    public String getMessage(){
         return ANSI_CYAN + "Não é possível realizar essa ação. Tente novamente!" + ANSI_RESET;
    }
}
