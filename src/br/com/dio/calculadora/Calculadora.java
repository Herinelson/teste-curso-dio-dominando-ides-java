package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o valor de A: ");
		a = scan.nextInt();
		System.out.println("Digite o valor de B: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		float divisao = divisao(a,b);
		
		System.out.println("A+B = " + soma);
		System.out.println("A-B = " + subtracao);
		System.out.println("A*B = " + multiplicacao);
		System.out.println("A/B = " + divisao);
		
	}

	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static float divisao(float a, float b) {
		return a / b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}

  
}
