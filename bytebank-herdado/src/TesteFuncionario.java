
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario felipe = new Designer();
		
		felipe.setNome("Felipe Carvalho");
		felipe.setCpf("123654852-65");
		felipe.setSalario(1500);
		
		System.out.println(felipe.getNome());
		System.out.println("O salario � de: " + felipe.getSalario());
		System.out.println("A bonifica��o � de: " + felipe.getBonificacao());

	}

}
