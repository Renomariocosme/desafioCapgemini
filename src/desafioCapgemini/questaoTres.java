package desafioCapgemini;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class questaoTres {

	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String palavra;
	

		System.out.println("Digite a palavra : ");
		palavra = leia.nextLine();
	
		isAnagrama(palavra);
		
	}
	
		
		static void isAnagrama(String texto) {

			HashMap<String, Integer> palavraDigitada = new HashMap<>();
			
			for(int i=0; i<= texto.length(); i++) {
				
				for(int p=i; p < texto.length(); p++ ) {
					
					
					char[] caracter = texto.substring(i,p+1).toCharArray();
					
					Arrays.sort(caracter);
					
					String subCaracter = new String(caracter);
					
					if(palavraDigitada.containsKey(subCaracter)) {
						palavraDigitada.put(subCaracter, palavraDigitada.get(subCaracter)+1);
					} else{
						palavraDigitada.put(subCaracter,1);
					}
				}
				
			}
			
			int pares = 0;
			
			for(String count : palavraDigitada.keySet()) {
				
				int p = palavraDigitada.get(count);
				pares += (p * (p - 1)) / 2;
			}
			System.out.println("Quantidade de pares são anagramas é de: " +  pares);
			
			
		}

		
			
		
		
		
}