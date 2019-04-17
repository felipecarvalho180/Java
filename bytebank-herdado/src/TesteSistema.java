
public class TesteSistema {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSenha(1331);
		
		Administrador admin = new Administrador();
		admin.setSenha(1561);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(1331);

		SistemaInterno sistema = new SistemaInterno();
		sistema.autentica(gerente);
		sistema.autentica(admin);
		sistema.autentica(cliente);
	}

}
