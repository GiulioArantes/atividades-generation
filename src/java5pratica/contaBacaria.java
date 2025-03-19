package java5pratica;

import java.util.Scanner;

public class ContaBacaria {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int operacao;
		float saldo = 1000;

		System.out.print("Operação: ");
		operacao = scan.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("\nOperação - Saldo\nSaldo: R$ " + saldo);
			break;
		case 2:
			System.out.print("\nOperação - Saque\nValor: R$ ");
			saldo -= scan.nextFloat();
			if (saldo >= 0) {
				System.out.println("\nNovo Saldo: R$ " + saldo);
			} else {
				System.out.println("\nSaldo Insuficiente!");
			}
			break;
		case 3:
			System.out.print("\nOperação - Depósito\nValor: R$ ");
			saldo += scan.nextFloat();
			System.out.println("\nNovo Saldo: R$ " + saldo);
			break;
		default:
			System.out.print("\nValor: R$ ");
			scan.nextFloat();
			System.out.println("Operação Inválida!");
			break;
		}
	}
}
