package br.com.bytebank.banco.teste;

public class TesteArrayPrimitivos {

	public static void main(String[] args) {
		int[] idades = new int[5];
		
//		idades[0] = 23;
//		idades[1] = 65;
//		idades[2] = 42;
//		idades[3] = 21;
//		idades[4] = 95;
		
//		int idade = idades[3];
		
//		System.out.println(idade);
//		System.out.println(idades.length);

		for (int i = 0; i < idades.length; i++) {
			idades[i] = (i + 2) * (i + 6);
		}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}

}
