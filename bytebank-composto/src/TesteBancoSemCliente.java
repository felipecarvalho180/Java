
public class TesteBancoSemCliente {
	public static void main(String[] args) {
		Conta contaDaThaina = new Conta();
		System.out.println(contaDaThaina.getSaldo());
		
		contaDaThaina.titular = new Cliente();
		contaDaThaina.titular.nome = "Thaina";
		System.out.println(contaDaThaina.titular.nome);
	}
}
