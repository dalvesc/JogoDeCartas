package view;

import java.util.Scanner;


/**
 * Menu com as opções pra iniciar o jogo
 * 
 * @author Adlla Katarine e Daniel Alves
 */
public class Menu {
    private static Scanner scan = new Scanner(System.in);
    public static final String ANSI_CYAN = "\u001B[36m";// transformar a cor da letra em ciano
    public static final String ANSI_RESET = "\u001B[0m";//reseta a cor pro padrão

    public static void main(String[] args) {
        boolean continuarJogar = true;//variável para saber se o usuário quer continuar a jogar ou encerrar o programa
        int opcao;//opção escolhida pelo usuário
        
        do{
            System.out.println("\n\t\t♠BEM VINDO AO JOGO PACIÊNCIA♠");

            System.out.println("\nO que deseja?\n"
            + "[1] - Iniciar Jogo.\n"
            + "[0] - Encerrar Jogo.\n");
            opcao = scan.nextInt();

            switch(opcao){

                case 1:
                    new MenuPaciencia(1);//opção para iniciar o jogo de paciência
                    break;

                case 0:
                    continuarJogar = false;//opção para encerrar o programa
                    break;

                default:
                    System.out.println(ANSI_CYAN + "Você digitou uma opção inválida!!! Escolha uma das opções disponíveis." + ANSI_RESET);
            }
        }while(continuarJogar);
    }
}