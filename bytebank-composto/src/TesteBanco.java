
public class TesteBanco {
	public static void main(String[] args) {
		Cliente felipe = new Cliente();
		felipe.nome = "Felipe Carvalho";
		felipe.cpf = "999.999.999-99";
		felipe.profissao = "programador";
		
		Conta contaDoFelipe = new Conta();
		contaDoFelipe.deposita(900);
		
		//associa a contaDoFelipe com o cliente Felipe
		contaDoFelipe.titular = felipe;
		System.out.println(contaDoFelipe.titular.nome);
	}
}
