
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(3773, 193);
		System.out.println(conta.getNumero());
		
		Cliente felipe = new Cliente();
		felipe.setNome("Felipe Carvalho");
		conta.setTitular(felipe);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
	}
}
