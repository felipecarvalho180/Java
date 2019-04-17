
public class TesteReferencias {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSalario(6000);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2000);
		
		Designer d = new Designer();
		ev.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registraFuncionario(gerente);
		controle.registraFuncionario(ev);
		controle.registraFuncionario(d);
		System.out.println(controle.getSoma());

	}

}
