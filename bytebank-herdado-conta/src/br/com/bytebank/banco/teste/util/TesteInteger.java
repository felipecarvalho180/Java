package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteInteger {

	public static void main(String[] args) {		
		int idade = 29;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		//Objeto do tipo int
		//boxing
		Integer idadeRef = Integer.valueOf(29);
		//unboxing
		int valor = idadeRef.intValue();
		
		//transformar string em int
		String s = "856";
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		int soma = numero + 4;
		
		System.out.println(soma);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);//autoboxing

	}

}
