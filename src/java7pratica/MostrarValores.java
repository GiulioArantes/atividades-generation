package java7pratica;

import java.util.Scanner;

public class MostrarValores {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String conjuntoDePares = "", conjuntoDeImpares = "";
		int soma = 0;

		System.out.println("Você irá criar uma lista com 10 números!");
		int[] inputVetor = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("\nDigite o " + (i + 1) + "º valor: ");
			inputVetor[i] = scan.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			soma += inputVetor[i];
			if (i % 2 != 0) {
				conjuntoDeImpares += String.valueOf(inputVetor[i]) + " ";
			}
			if (inputVetor[i] % 2 == 0) {
				conjuntoDePares += String.valueOf(inputVetor[i]) + " ";
			}
		}
		float media = ((float) soma) / inputVetor.length;

		System.out.println("\nElementos nos índices ímpares: \n" + conjuntoDeImpares);
		System.out.println("\nElementos pares: \n" + conjuntoDePares);
		System.out.println("\nSoma: " + soma);
		System.out.printf("\nMédia: %.2f", media);
		scan.close();
	}
}
