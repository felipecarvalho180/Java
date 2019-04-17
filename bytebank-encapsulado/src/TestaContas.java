
public class TestaContas {
	public static void main(String[] args) {
		Conta conta = new Conta(250, 15000);
		
		conta.deposita(200);
		
		System.out.println("Saldo da conta: " + conta.getSaldo());
		
		conta.setAgencia(980);
		System.out.println("Agencia: " + conta.getAgencia());
		
		System.out.println("O total de contas é: " + Conta.getTotal());
	}
}
