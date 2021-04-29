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

    public MenuPaciencia(int quantidadeBaralho) {
        ControllerMenu controllerMenu = new ControllerMenu(quantidadeBaralho);
        ControllerPaciencia controllerPaciencia = new ControllerPaciencia(controllerMenu.getBaralhoEmbaralhado());
        exibirOpcoesPaciencia(controllerPaciencia);

    }
    
    private void exibirOpcoesPaciencia(ControllerPaciencia controllerPaciencia){
        boolean continuarJogar = true;//variável para saber se o usuário quer continuar a jogar ou retornar
        int opcao;//opção escolhida pelo usuário

        exibirDadosJogo(controllerPaciencia);
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
    
    private void exibirDadosJogo(ControllerPaciencia controllerPaciencia){ 
        System.out.print("1 - ESTOQUE: ");
        //controllerPaciencia.getEstoque();
        System.out.print(controllerPaciencia.getEstoque());
        //imprime cartas estoque
        System.out.print("2 - DESCARTE: ");
        //controllerPaciencia.getDescarte();
        System.out.println(controllerPaciencia.getDescarte());
        //cartas no descarte
        System.out.print("3 - FUNDAÇÃO 1: ");
        //controllerPaciencia.getFundacao();
        System.out.println(controllerPaciencia.getFundacao());
        //cartas na fundação
        System.out.print("4 - FUNDAÇÃO 2: ");
        //controllerPaciencia.getFundacao();
        System.out.println(controllerPaciencia.getFundacao());
        //cartas na fundação
        System.out.print("5 - FUNDAÇÃO 3: ");
        //controllerPaciencia.getFundacao();
        System.out.println(controllerPaciencia.getFundacao());
        //cartas na fundação
        System.out.print("6 - FUNDAÇÃO 4: ");
        //controllerPaciencia.getFundacao();
        System.out.println(controllerPaciencia.getFundacao());
        //cartas na fundação
        System.out.print("7 - FILEIRA 1: ");
        //controllerPaciencia.getFileiras();
        System.out.println(controllerPaciencia.getFileiras());
        //cartas da fileira
        System.out.print("8 - FILEIRA 2: ");
        //controllerPaciencia.getFileiras();
        System.out.println(controllerPaciencia.getFileiras());
        //cartas da fileira
        System.out.print("9 - FILEIRA 3: ");
        //controllerPaciencia.getFileiras();
        System.out.println(controllerPaciencia.getFileiras());
        //cartas da fileira
        System.out.print("10 - FILEIRA 4: ");
        //controllerPaciencia.getFileiras();
        System.out.println(controllerPaciencia.getFileiras());
        //cartas da fileira
        System.out.print("11 - FILEIRA 5: ");
        //controllerPaciencia.getFileiras();
        System.out.println(controllerPaciencia.getFileiras());
        //cartas da fileira
        System.out.print("12 - FILEIRA 6: ");
        //controllerPaciencia.getFileiras();
        System.out.println(controllerPaciencia.getFileiras());
        //cartas da fileira
        System.out.print("13 - FILEIRA 7: ");
        //controllerPaciencia.getFileiras();
        System.out.println(controllerPaciencia.getFileiras());
        //cartas da fileira
    }
}
