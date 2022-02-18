package desafioCapgemini;

import java.util.Scanner;

public class questaoDois {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		Boolean validacaoDigito = false;
		Boolean validacaoLetraMaiuscula = false;
		Boolean validacaoLetraMinuscula = false;
		Boolean validacaoCaractereEspecial = false;
		
		String senha;
		
		System.out.println("Digite aqui sua senha que atenda os seguintes critérios: "+ "\n" +
		"Deve possuir no mínino 6 caracteres ->"+"\n"+
		"Deve possuir no mínino 1 digito ->" + "\n"+
		"Deve possuir no mínino 1 letra maiúscula ->"+"\n"+
		"Deve possuir no mínino 1 letra minúsculo ->"+"\n"+
		"Deve possuir no mínino 1 caractere especial (! @ # $ % ^ & * ()- +) ->");
		
		System.out.println("Digite aqui a senha: ");
		senha = leia.next();
		
		
		if(senha.length()<6) {
			
			System.out.println("A senha digitava não segue os critérios de segurança, usando somente: "+(senha.length())+
					" caracteres.");
		} else {
			for (Character d : senha.toCharArray()) {
				if (d >= '0' && d <= '9') {
					validacaoDigito = true;
				} else if (d >= 'A' && d <= 'Z') {
					validacaoLetraMaiuscula = true;
				} else if (d >= 'a' && d <= 'z') {
					validacaoLetraMinuscula = true;
				} else {
					validacaoCaractereEspecial = true;
				}
			}

		}
		if (!validacaoDigito) {
			System.out.println("Atenção ⚠️, A senha precisa ter no mínino um digito!");
		}
		if (!validacaoLetraMaiuscula) {
			System.out.println("Atenção ⚠️, A senha precisa ter no ao menos uma letra maiúscula");
		}
		
		if(!validacaoLetraMinuscula) {
			System.out.println("Atenção ⚠️, A senha precisa ter ao menos uma letra minúscula");
		}
		
		if(!validacaoCaractereEspecial) {
			System.out.println("Atenção ⚠️, A senha precisa ter algo menos um caractere especial");
		}
		
		if(validacaoDigito && validacaoLetraMaiuscula && validacaoLetraMinuscula && validacaoCaractereEspecial) {
			System.out.println("Senha foi criada com sucesso!");
		}
		leia.close();
	}	
}
