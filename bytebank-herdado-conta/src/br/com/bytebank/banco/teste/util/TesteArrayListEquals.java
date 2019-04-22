package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {
	
	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();

		ContaCorrente cc1 = new ContaCorrente(11, 45);
		ContaPoupanca cp1 = new ContaPoupanca(45, 60);
		ContaCorrente cc2 = new ContaCorrente(11, 45);
		
		lista.add(cc1);
		lista.add(cp1);

		boolean existe = lista.contains(cc2);
		
		System.out.println("Já existe? " + existe);

		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
	}
}
