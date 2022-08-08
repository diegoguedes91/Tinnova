package application;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number, factorial = 1; 
		
		System.out.print("Digite um número que deseja obter o fatorial: ");
		number = sc.nextInt(); 
		
		if(number >= 0) { 
			
			for(int i = 1; i <= number; i++) {
				factorial = factorial * i; 
			}
			System.out.println("O número fatorial é: " + factorial);
			
		}else {
			System.out.println("Não existe fatorial para números negativos.");
		}
		
		sc.close();
	}

}