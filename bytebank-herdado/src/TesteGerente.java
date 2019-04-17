
public class TesteGerente {

	public static void main(String[] args) {
		Gerente felipe = new Gerente();
		felipe.setNome("Felipe Carvalho");
		felipe.setCpf("654815623-85");
		felipe.setSalario(1000);
		
		System.out.println(felipe.getNome());
		System.out.println(felipe.getCpf());
		System.out.println(felipe.getSalario());
		
		felipe.setSenha(1331);
		boolean autenticacao = felipe.autentica(1331);
		System.out.println(autenticacao);
		
		System.out.println(felipe.getBonificacao());

	}

}
