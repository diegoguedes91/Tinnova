package application;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int multiples = 0;
		
		System.out.print("Digite um valor interiro: ");
		int number = sc.nextInt();
		
		for(int i = 1; i < number; ++i) {
			
			if(i % 3 == 0 || i % 5 == 0) {
				multiples += i;
			}
		}
		
		System.out.println("A soma de todos os números multiplos de 3 ou 5 é: " + multiples);
		
		sc.close();
	}

}
