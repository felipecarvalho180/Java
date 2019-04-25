package br.com.bytebank.banco.modelo;

public abstract class Conta implements Comparable<Conta> {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Numero da conta inválido");
        }
        
		Conta.total++;
		// System.out.println("Temos o total de " + Conta.total + " conta(s)");
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta número " + this.numero);
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		try {
			if (this.saldo < valor) {
				throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
			}

			this.saldo -= valor;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void transfere(double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode número menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (numero <= 0) {
			System.out.println("Não pode agencia menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref;
		
		if (this.agencia != outra.agencia) {
			return false;
		}
		
		if (this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
	
	@Override
	public String toString() {
		return "Número: " + this.numero + ", Agencia " + this.agencia + ", Saldo: " + this.saldo;
	}
}
