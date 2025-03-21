package java7pratica;

import java.util.Scanner;

public class EncontrarNumero {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean foiEncontrado = false;

		System.out.println("Crie a sua lista pessoal de números!");
		int[] vetorNaoOrdenado = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("\nDigite o " + (i + 1) + "º valor: ");
			vetorNaoOrdenado[i] = scan.nextInt();
		}

		System.out.print("\nDigite o número que você deseja encontrar: ");
		int numeroDesejado = scan.nextInt();

		for (int i = 0; i < 10; i++) {
			if (vetorNaoOrdenado[i] == numeroDesejado) {
				foiEncontrado = true;
				System.out.println("O número " + numeroDesejado + " está localizado na posição: " + i);
			}
		}
		
		if (!(foiEncontrado)) {
			System.out.println("O número " + numeroDesejado + " não foi encontrado!");
		}
		
		scan.close();
	}
}
