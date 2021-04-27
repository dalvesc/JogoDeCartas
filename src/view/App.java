package view;

import java.util.Scanner;
import controller.ControllerMenu;

public class App {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        boolean continuarJogar = true;
        int opcao;
        System.out.println("\t\t♠BEM VINDO AO PACIÊCIA♠");
        do{
            System.out.println("\nO que deseja?\n"
            + "[1] - Iniciar Jogo\n"
            + "[0] - Encerrar Jogo\n");
            opcao = scan.nextInt();

            switch(opcao){

                case 1:
                new ControllerMenu(1);
                break;

                case 0:
                continuarJogar = false;
                break;

                default:
                    System.out.println("Opção inválida! Digite novamente: ");
            }
        }while(continuarJogar);
        
    }
}
