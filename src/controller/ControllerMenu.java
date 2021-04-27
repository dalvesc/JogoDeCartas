package controller;

import model.Baralho;


/**
 *
 * @author Adlla Katarine e Daniel Alves
 */
public class ControllerMenu {
    Baralho baralho;

    public ControllerMenu(int quantidadeBaralho) {
        this.baralho = new Baralho(quantidadeBaralho);
    }

}
