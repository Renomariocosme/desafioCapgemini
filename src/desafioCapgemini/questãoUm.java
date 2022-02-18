package desafioCapgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class questãoUm {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		List<String> escada = new ArrayList<>();
		
		System.out.print("Digite aqui a quantidade de vezes: ");
		int degrausQuantidade = leia.nextInt();
		
		for(int i=0; i < degrausQuantidade; i++) {
			escada.add("".repeat(degrausQuantidade-i)+"*".repeat(i+1));
		}
		
		for(String d: escada) {
			System.out.println(d);
		}
		
	}
}
