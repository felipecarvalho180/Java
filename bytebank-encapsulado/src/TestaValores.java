
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(3773, 150);
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(9568, 450);
		System.out.println(conta2.getAgencia());
		
		Conta conta3 = new Conta(5648, 550);
		System.out.println(conta3.getAgencia());
		
		System.out.println("Temos o total de " + Conta.getTotal() + " conta(s)");
	}
}
