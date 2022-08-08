package application;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] vector = {5, 3, 2, 4, 7, 0, 6};
		int aux; 
		boolean control; 
		
		// looping para acessar cada elemento do vetor
		for(int i = 0; i < vector.length; ++i) {
			
			control = true; 
			
			// looping para comparar os elementos
			for(int j = 0; j < (vector.length - 1); ++j) {
				
				if(vector[j] > vector[j + 1]) {
					aux = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = aux;
					control = false; 
				}
			}
			
			// Caso a variavel de controle seja verdadeira, então não há necessidade de comparação
			if(control) {
				break; 
			}
		}
		
		
		for(int i =0; i < vector.length; ++i) {
			System.out.print(vector[i] + " ");
		}

	}

}
