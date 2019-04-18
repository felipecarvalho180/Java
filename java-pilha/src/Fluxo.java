
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao e) {
			String msg = e.getMessage();
			System.out.println("Exception, " + msg);
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");

//      ArithmeticException ex = new ArithmeticException("código deu errado");
//      throw ex;
		throw new MinhaExcecao ("código deu errado");

		// System.out.println("Fim do metodo2");
	}
}