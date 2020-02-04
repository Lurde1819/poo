package main;

import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("Digite o nome do aluno:");
		String nome = sc.nextLine();
		System.out.println("Informe a idae do aluno:");
		String idade = sc.nextLine();
		sc.close();
		 System.out.println("Aluno " + nome + ", sua idade é " + idade + " anos.");

	}

}
