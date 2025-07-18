package br.com.john.cm;

import br.com.john.cm.model.Tabuleiro;
import br.com.john.cm.view.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
        new TabuleiroConsole(tabuleiro);

    }
}
