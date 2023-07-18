package aplicacao;

import java.util.Scanner;
import entidades.Empregado;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Empregado empregado = new Empregado();
		System.out.print("Por favor preencha as informacoes do empregado\nNome: ");
		empregado.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		empregado.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		empregado.imposto = sc.nextDouble();
		System.out.println("\nEmpregado: " + empregado);
		System.out.print("\nPorcentagem desejada para aumento salarial: ");
		empregado.aumentoSalarial(sc.nextDouble());
		System.out.println("\nDados atualizados: " + empregado);
		sc.close();
	}
}
