package controller;

import model.Baralho;
import util.Embaralhar;


/**
 *
 * @author Adlla Katarine e Daniel Alves
 */
public class ControllerMenu {
    Baralho baralho;

    public ControllerMenu(int quantidadeBaralho) {
        new Baralho(quantidadeBaralho);
        //falta embaralhar
        this.baralho = Embaralhar.embaralhar(this.baralho);
    }

}
