package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributo {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(123, 5464);
		conta.deposita(450);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		calculador.registra(conta);
		calculador.registra(seguro);
		
		System.out.println(calculador.getTotalImposto());

	}

}
