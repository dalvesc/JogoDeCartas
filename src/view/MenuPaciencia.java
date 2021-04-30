package view;

import java.util.ArrayList;
import java.util.Scanner;
import controller.ControllerMenu;
import controller.ControllerPaciencia;


/**
 * 
 *Menu com as opções pro jogo de Paciência
 * 
 * @author Adlla Katarine e Daniel Alves
 */
public class MenuPaciencia {
    Scanner scan = new Scanner(System.in);
    ControllerPaciencia controllerPaciencia;//variável para o controller do jogo paciência

    public MenuPaciencia(int quantidadeBaralho) {
        ControllerMenu controllerMenu = new ControllerMenu(quantidadeBaralho);
        controllerPaciencia = new ControllerPaciencia(controllerMenu.getBaralhoEmbaralhado());
        exibirOpcoesPaciencia();
    }
    
    private void exibirOpcoesPaciencia(){
        boolean continuarJogar = true;//variável para saber se o usuário quer continuar a jogar ou retornar
        int opcao;//opção escolhida pelo usuário

        exibirDadosJogo();
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
                    System.out.print("Digite de qual fileira gostaria de virar a carta: ");
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
        boolean continuarJogar = true;//variável para saber se o usuário quer continuar a jogar ou retornar
        int opcao;

        System.out.println("Escolha o próximo movimento da carta.");
        System.out.println("[1] - Mover a carta da pilha de estoque para a pilha de descarte.\n"
                + "[2] - Mover a carta da pilha de descarte para uma das pilhas de fileiras.\n"
                + "[3] - Mover a carta da pilha de descarte para uma das pilhas de fundação."
                + "[4] - Mover a carta da pilha de fileiras para uma das pilhas de fundação.\n"
                + "[5] - Mover a carta da pilha de fundação para uma das pilhas de fileiras.\n"
                + "[6] - Mover a carta da pilha de fileiras para outra pilha de fileiras.\n"
                + "[7] - Mover a pilha de descarte para a pilha de estoque, caso esteja vazia.\n"
                + "[0] - Retornar ao menu anterior.");
        
        opcao = scan.nextInt();
        //método exibir jogo
        do{
            switch (opcao) {
                case 1:
                    //método pilha de estoque para descarte
                    break;

                case 2:
                    System.out.print("Digite para qual fileira gostaria de mover a carta: ");
                    //método pilha de descarte para fileiras
                    break;

                case 3:
                    System.out.print("Digite para qual fundação gostaria de mover a carta: ");
                    //método pilha de descarte para fundações
                    break;

                case 4:
                    System.out.print("Digite de qual fileira gostaria de mover a carta: ");
                    
                    System.out.print("Digite para qual fundação gostaria de mover a carta: ");
                    //método pilha de fileiras para fundações
                    break;

                case 5:
                    System.out.print("Digite de qual fundação gostaria de mover a carta: ");

                    System.out.print("Digite para qual fileira gostaria de mover a carta: ");
                    //método pilha de fundação para fileiras
                    break;

                case 6:
                    System.out.print("Digite de qual fileira gostaria de mover a carta: ");

                    System.out.print("Digite qual carta (ou a partir de qual) gostaria de mover: ");

                    System.out.print("Digite para qual fileira gostaria de mover a(s) carta(s): ");
                    
                    //método pilha de fundação para fileiras
                    break;

                case 7:
                    //método pilha de descarte para estoque
                    break;
                
                case 0:
                    continuarJogar = false;
                    break;

                default:
                    printOpcaoInvalida();

             }
        } while(continuarJogar);
    }
    
    private void printOpcaoInvalida(){
        System.out.println("Você digitou uma opção inválida!!! Escolha uma das opções disponíveis.");
    }
    
    private void exibirDadosJogo(){ 
        System.out.print("\n1 - ESTOQUE: ");
        System.out.print(controllerPaciencia.getEstoque());//mostra o estoque do jogo
        System.out.print("\n2 - DESCARTE: ");
        //System.out.println(controllerPaciencia.getDescarte());//cartas descartadas
        System.out.print("\n3 - FUNDAÇÃO 1: ");
        //System.out.println(controllerPaciencia.getFundacao());//cartas da fundação 1
        System.out.print("\n4 - FUNDAÇÃO 2: ");
        //System.out.println(controllerPaciencia.getFundacao());//cartas da fundação 2
        System.out.print("\n5 - FUNDAÇÃO 3: ");
        //System.out.println(controllerPaciencia.getFundacao());//cartas da fundação 3
        System.out.print("\n6 - FUNDAÇÃO 4: ");
        //System.out.println(controllerPaciencia.getFundacao());//cartas da fundação 4
        System.out.print("\n7 - FILEIRA 1: ");
        System.out.println(controllerPaciencia.getFileiras().get(0));//cartas fileira 1
        System.out.print("\n8 - FILEIRA 2: ");
        System.out.println(controllerPaciencia.getFileiras().get(1));//cartas fileira 2
        System.out.print("\n9 - FILEIRA 3: ");
        System.out.println(controllerPaciencia.getFileiras().get(2));//cartas fileira 3
        System.out.print("\n10 - FILEIRA 4: ");
        System.out.println(controllerPaciencia.getFileiras().get(3));//cartas fileira 4
        System.out.print("\n11 - FILEIRA 5: ");
        System.out.println(controllerPaciencia.getFileiras().get(4));//cartas fileira 5
        System.out.print("\n12 - FILEIRA 6: ");
        System.out.println(controllerPaciencia.getFileiras().get(5));//cartas fileira 6
        System.out.print("\n13 - FILEIRA 7: ");
        System.out.println(controllerPaciencia.getFileiras().get(6));//cartas fileira 7
    }
}
