package areaDaCasa;

import java.util.Scanner;

public class AreaDaCasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		String comodo;
		int largura;
		int comprimento;
		int total;
		String resposta;
		
		System.out.print("Qual o nome do cômodo? ");
		comodo = leitor.next();
		System.out.print("Qual a largura? ");
		largura = leitor.nextInt();
		System.out.print("Qual o comprimento? ");
		comprimento = leitor.nextInt();
		int produto = largura * comprimento;
		System.out.print("O(a) " + comodo + " tem " + produto + " metros quadrados.");
		total = produto;
		
		System.out.println("Você deseja calcular mais cômodos (S/N)? ");
		resposta = leitor.next();
		
		while (resposta.equals("S") || resposta.equals("s")) {
			System.out.print("Qual o nome do cômodo? ");
			comodo = leitor.next();
			System.out.print("Qual a largura? ");
			largura = leitor.nextInt();
			System.out.print("Qual o comprimento? ");
			comprimento = leitor.nextInt();
			int produto2 = largura * comprimento;
			System.out.print("O(a) " + comodo + " tem " + produto2 + " metros quadrados.");
			total = produto;
			
			System.out.println("Você deseja calcular mais cômodos (S/N)? ");
			resposta = leitor.next();
		}
		
		
		

	}

}
