package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		String nome = "Felipe"; //object literal
		//String outro = new String("Carvalho");
		
		String outra = nome.replace("F", "f");
		String outra1 = nome.toUpperCase();
		char c = nome.charAt(3);
		int pos = nome.indexOf("ip");
		String sub = nome.substring(2);
		String vazio = "";
		String comEspaco = "    Felipe     ";
		String semEspaco = comEspaco.trim();
		
		System.out.println(nome);
		System.out.println(outra);
		System.out.println(outra1);
		System.out.println(c);
		System.out.println(pos);
		System.out.println(sub);
		System.out.println(nome.length());
		System.out.println(vazio.isEmpty());
		System.out.println(comEspaco);
		System.out.println(semEspaco);
		System.out.println(nome.contains("eli"));
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
	}

}
