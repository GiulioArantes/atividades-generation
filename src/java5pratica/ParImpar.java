package java5pratica;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a;
		String resul;

		System.out.print("Digite um número: ");
		a = scan.nextInt();

		if (a % 2 == 0) {
			resul = " é par";
		} else {
			resul = " é ímpar";
		}

		if (a > 0) {
			resul += " e positivo!";
		} else if (a < 0) {
			resul += " e negativo!";
		}

		System.out.println("O número " + a + resul);
	}
}
