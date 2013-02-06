package br.com.teste;
import static org.junit.Assert.*;

import org.junit.Test;

import br.com.app.Fibonacci;


public class TesteFibonacci {

	@Test
	public void testFibonacci(){
		Fibonacci fibonacci = new Fibonacci();
		assertEquals(0, fibonacci.calcularFibonacci(0));
		assertEquals(1, fibonacci.calcularFibonacci(1));
	}
}
