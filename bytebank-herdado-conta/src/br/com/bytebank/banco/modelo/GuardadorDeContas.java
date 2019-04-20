package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

	Conta[] contas = new Conta[5];
	int referencia = 0;
	
	public void adicionar(Conta ref) {
		this.contas[this.referencia] = ref;
		this.referencia++;
	}
	
	public int getNumeroDeContas() {
		return this.referencia;
	}
	
	public Conta getPosicaoPedida(int pos) {
		return this.contas[pos];
	}
	
}
