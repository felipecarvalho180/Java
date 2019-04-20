package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteAdicionarContas {

	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();
		ContaCorrente cc1 = new ContaCorrente(11, 45);
		ContaPoupanca cp1 = new ContaPoupanca(45, 60);
		
		guardador.adicionar(cc1);
		guardador.adicionar(cp1);
		
		System.out.println(guardador.getNumeroDeContas());
		
		Conta ref = guardador.getPosicaoPedida(0);
		System.out.println(ref);
		System.out.println(ref.getNumero());
	}

}
