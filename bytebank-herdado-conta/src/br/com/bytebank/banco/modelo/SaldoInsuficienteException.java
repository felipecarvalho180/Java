package br.com.bytebank.banco.modelo;

public class SaldoInsuficienteException extends RuntimeException{

	SaldoInsuficienteException(String msg){
		super(msg);
	}
	
}
