package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		ContaCorrente[] contas = new ContaCorrente[3];
		ContaCorrente cc1 = new ContaCorrente(15, 1654);
		ContaCorrente cc2 = new ContaCorrente(15, 2464);
		ContaCorrente cc3 = new ContaCorrente(15, 3021);
		
		contas[0] = cc1;
		contas[1] = cc2;
		contas[2] = cc3;
		
		System.out.println(contas[0].getNumero());
		System.out.println(contas[1].getNumero());
		System.out.println(contas[2].getNumero());

	}

}
