package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(15000, 13245646);
		ContaPoupanca cp = new ContaPoupanca(16000, 54646464);
		
		System.out.println(cc);
		System.out.println(cp);

	}

}
