
public class TesteConexao {

	public static void main(String[] args) {
		
		//maneira correta
		
		try(Conexao cone = new Conexao()){
			cone.leDados();
		} catch (Exception e) {
			System.out.println("Erro de conexão");
		}
		
		//---------------------
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (Exception e) {
//			System.out.println("Erro de conexão");
//		} finally {
//			con.fecha();
//		}

	}

}
