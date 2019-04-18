
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
