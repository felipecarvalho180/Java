package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();

		ContaCorrente cc1 = new ContaCorrente(11, 45);
		ContaPoupanca cp1 = new ContaPoupanca(45, 60);
		
		lista.add(cc1);
		lista.add(cp1);
		
		System.out.println("Número de elementos do array " + lista.size());
		
		lista.remove(0);
		System.out.println("Número de elementos do array " + lista.size());
		
		ContaCorrente cc2 = new ContaCorrente(56, 656);
		ContaPoupanca cp3 = new ContaPoupanca(15, 544);
		
		lista.add(cc2);
		lista.add(cp3);
		
		//forma antiga
		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("-------------------------");
		
		//forma atual 
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}
