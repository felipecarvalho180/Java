package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 190;

		// metodo deposita
		conta.deposita(50);
		System.out.println(conta.saldo);

		// metodo saca
		conta.saca(150);
		System.out.println(conta.saldo);

		// metodo transfere
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		boolean sucessoTransferencia = conta2.transfere(600, conta);

		if (sucessoTransferencia) {
			System.out.println("Tranferencia feita com sucesso");
		} else {
			System.out.println("Falha na transferencia");
		}
		;
		System.out.println("saldo conta 1: " + conta.saldo);
		System.out.println("saldo conta 2: " + conta2.saldo);
	}
}
