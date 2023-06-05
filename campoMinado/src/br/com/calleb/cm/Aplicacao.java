package br.com.calleb.cm;

import br.com.calleb.cm.modelo.Tabuleiro;
import br.com.calleb.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);		
		new TabuleiroConsole(tabuleiro);
	}
}
