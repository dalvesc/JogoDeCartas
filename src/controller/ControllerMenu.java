package controller;

import model.Baralho;

public class ControllerMenu {
    Baralho baralho;

    public ControllerMenu(int quantidadeBaralho) {
        this.baralho = new Baralho(quantidadeBaralho);
    }

}
