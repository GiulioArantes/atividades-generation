package java5pratica;

import java.util.Scanner;

public class Inteiros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b, c, soma;

		System.out.print("Digite o número A: ");
		a = scan.nextInt();

		System.out.print("\nDigite o número B: ");
		b = scan.nextInt();

		System.out.print("\nDigite o número C: ");
		c = scan.nextInt();
		soma = a + b;

		if (soma > c) {
			System.out.println("\nA Soma de " + a + " + " + b + " é igual a " + soma + " que é maior do que " + c);
		} else if (soma < c) {
			System.out.println("\nA Soma de " + a + " + " + b + " é igual a " + soma + " que é menor do que " + c);
		} else {
			System.out.println("\nA Soma de " + a + " + " + b + " é igual a " + soma + " que é igual a " + c);
		}
	}
}
