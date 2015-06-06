package co.edu.udea.appempresariales.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.udea.appempresariales.codebreaker.CodeBreaker;

public class TestCodeBreaker {

	CodeBreaker codeBreaker = new CodeBreaker();
	String userNumber;
	String secretNumber="1234";
	@Test
	public void testAllNumbers() {
		userNumber= "1234";
		
		String resultado = codeBreaker.guessNumber(userNumber);
		
		assertEquals("XXXX", resultado);
	}
	
	@Test
	public void testOneNumber() {
		userNumber= "1678";
		String resultado = codeBreaker.guessNumber(userNumber);
		
		assertEquals("X", resultado);
	}

	@Test
	public void testTwoNumbers() {
		userNumber= "1538";
		String resultado = codeBreaker.guessNumber(userNumber);
		assertEquals("XX", resultado);
	}
	
	@Test
	public void testThreeNumbers() {
		userNumber= "1238";
		String resultado = codeBreaker.guessNumber(userNumber);
		assertEquals("XXX", resultado);
	}
	
	@Test
	public void testOneNumberDisorder() {
		userNumber= "4576";
		String resultado = codeBreaker.guessNumber(userNumber);
		assertEquals(resultado,"-", resultado);
	}
	
	@Test
	public void testTwoNumbersDisorder() {
		userNumber= "4516";
		String resultado = codeBreaker.guessNumber(userNumber);
		assertEquals(resultado,"--", resultado);
	}
	
	@Test
	public void testThreeNumbersDisorder() {
		userNumber= "4316";
		String resultado = codeBreaker.guessNumber(userNumber);
		assertEquals(resultado,"---", resultado);
	}
	
	@Test
	public void testTwoNumbersDisorderOneNumberOrder() {
		userNumber= "1243";
		String resultado = codeBreaker.guessNumber(userNumber);
		assertEquals(resultado,"XX--", resultado);
	}
	
	@Test
	public void testAnyNumber() {
		userNumber= "1398";
		String resultado = codeBreaker.guessNumber(userNumber);
		assertEquals(resultado,"X-", resultado);
	}

	

}
