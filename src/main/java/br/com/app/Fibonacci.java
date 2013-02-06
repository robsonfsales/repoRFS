package br.com.app;

public class Fibonacci {

	public int calcularFibonacci(int numero){
		if (numero == 0)
			return 0;
		if (numero <= 2)
			return 1;
		return calcularFibonacci(numero - 1) + calcularFibonacci(numero - 2);
	}
}
