
public class TestaPontoFlutuante {
	public static void main(String[] args) {
		double salario;
		salario = 1270.5;
		System.out.println("Meu salario � " + salario);
		
		double divisao;
		divisao = 3.14 / 2;
		System.out.println(divisao);
		
		double primeiraTentativa = 5 / 2;
		System.out.println(primeiraTentativa);
		
		//maneira correta de usar conta com resultado double
		double segundaTentativa = 5.0 / 2;
		System.out.println(segundaTentativa);
	}
}
