package model;

import java.util.Collections;
import java.util.List;

import util.MostrarCarta;


/**
 *
 * @author Adlla Katarine e Daniel Alves
 */
public class PilhaEstoque extends Pilha{

    public PilhaEstoque() {
        super();
    }

    /**
     * 
     * Método que adiciona uma List de cartas no estoque (caso esteja vazio), inverte a ordem e chama o método
     * que oculta as cartas.
     * 
     * @param estoque uma List<Carta>.
     */
    public void addEstoque(List<Carta> estoque) {
        if(this.pilha.isEmpty()){
            this.pilha.addAll(estoque);
            Collections.reverse(this.pilha);
            MostrarCarta.mostrar(this.pilha, this.pilha.size(), false);
        }
    }

    /**
     * 
     * Método que verifica se tem carta(s) suficiente(s) no estoque para ser(em) movida(s).
     * 
     * @param qtdCartasMovidas quantidade de cartas que deseja ser movida.
     * @return true caso possa ser movida a quantidade de cartas do estoque.
     */
    public boolean verificaMovimentacaoEstoque(int qtdCartasMovidas){
        return (qtdCartasMovidas <= this.pilha.size()) == true;
    }
}
