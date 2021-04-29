package view;

import java.util.Scanner;
import controller.ControllerMenu;


/**
 * 
 *Menu com as opções pro jogo de Paciência
 * 
 * @author Adlla Katarine e Daniel Alves
 */
public class MenuPaciencia {
    Scanner scan = new Scanner(System.in);

    public MenuPaciencia(int quantidadeBaralho) {
        new ControllerMenu(quantidadeBaralho);
        //exibir dados partida
        exibirOpcoesPaciencia();
    }
    
    private void exibirOpcoesPaciencia(){
        boolean continuarJogar = true;//variável para saber se o usuário quer continuar a jogar ou encerrar o programa
        int opcao;//opção escolhida pelo usuário

        System.out.println("Escolha a próxima jogada.");
        System.out.println("[1] - Virar carta do estoque.\n"
                + "[2] - Virar carta da pilha de fileira.\n"
                + "[3] - Pedir dados da carta.\n"
                + "[4] - Mover cartas.\n"
                + "[5] - Iniciar jogo novamente.\n"
                + "[0] - Retornar ao menu anterior.");

        opcao = scan.nextInt();
        do{
            switch (opcao) {
                case 1:
                    //virar carta estoque
                    break;

                case 2:
                    //virar carta fileira
                    break;

                case 3:
                    //dados carta
                    break;

                case 4:
                    menuMoverCarta();
                    break;
                case 5:
                    //reiniciar jogo
                    break;

                case 0:
                    continuarJogar = false;
                    break;

                default:
                printOpcaoInvalida();
            }
        } while(continuarJogar);
    }


    private void menuMoverCarta(){
        System.out.println("Escolha o próximo movimento da carta.");
        System.out.println("[1] - Mover a carta da pilha de estoque para a pilha de descarte.\n"
                + "[2] - Mover a carta da pilha de descarte para uma das pilhas de fileiras.\n"
                + "[3] - Mover a carta da pilha de fileiras para uma das pilhas de fundação.\n"
                + "[4] - Mover a carta da pilha de fundação para uma das pilhas de fileiras.\n"
                + "[5] - Mover a carta da pilha de fileiras para outra pilha de fileiras.\n"
                + "[6] - Mover a carta da pilha de descarte para uma das pilhas de fundação.");
        int menuMoverCarta = scan.nextInt();

        //método exibir jogo
        
        do{
            switch (menuMoverCarta) {
                case 1:
                    //método pilha de estoque para descarte
                    break;
                case 2:
                    System.out.print("Digite em qual das fileiras gostaria de mover a carta: ");
                    //método pilha de descarte para fileiras
                    break;
                case 3:
                    System.out.print("Digite em qual das fundações gostaria de mover a carta: ");
                    //método pilha de fileiras para fundação
                    break;
                case 4:
                    System.out.print("Digite em qual das fileiras gostaria de mover a carta: ");
                    //método pilha de fundação para fileiras
                    break;
                case 5:
                    System.out.print("Digite em qual das fileiras gostaria de mover a carta: ");
                    //método pilha de fundação para fileiras
                    break;
                default:
                    printOpcaoInvalida();
             }
        } while(menuMoverCarta<1 || menuMoverCarta>5);
    }
    
    private void printOpcaoInvalida(){
        System.out.println("Você digitou uma opção inválida!!! Escolha uma das opções disponíveis.");
    }
    
    
}
