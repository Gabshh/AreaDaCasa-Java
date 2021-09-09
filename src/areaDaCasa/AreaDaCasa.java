package areaDaCasa;

import java.util.Scanner;

public class AreaDaCasa {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		String comodo;
		int largura;
		int comprimento;
		int total = 0;

		String resposta;

		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("                         Cálculo de área de uma casa");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println();
		
		System.out.print("Deseja iniciar o cálculo? (S/N)? ");
		resposta = leitor.next();

		if (resposta.equals("S") || resposta.equals("s")) {

			while (resposta.equals("S") || resposta.equals("s")) {
				System.out.print("Qual o nome do cômodo? ");
				comodo = leitor.next();

				System.out.print("Qual a largura? ");
				largura = leitor.nextInt();

				System.out.print("Qual o comprimento? ");
				comprimento = leitor.nextInt();

				int areaComodo = largura * comprimento;
				total = areaComodo + total;

				System.out.print("O(a) " + comodo + " tem " + largura * comprimento + " metros quadrados.");

				System.out.print(" Você deseja calcular mais cômodos (S/N)? ");
				resposta = leitor.next();

				if (resposta.equals("N") || resposta.equals("n")) {

					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("A Área total da casa é " + total + " metros quadrados!!");
					System.out.println();
					System.out.println("ESPERO TER AJUDADO! :)");

					leitor.close();
					
				}

			} 

		}else if (resposta.equals("N") || resposta.equals("n")) {
			System.out.println();
			System.out.println("Ok, se precisar estou aqui!! :)");
		}else {
			System.out.println();
			System.out.println("Por favor, responda corretamente!!");
		}

	}

}
