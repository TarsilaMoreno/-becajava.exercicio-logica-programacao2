package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String [] args) {
		
		System.out.println("Diga qual valor base do seu salario");
	
		Scanner entrada = new Scanner(System.in);
		int valor = entrada.nextInt();
		
		System.out.println("Diga qual percentual de acr�scimo, digite apenas valor sem simbolos");
		int percentual	= entrada.nextInt();
		
		int porcentagem = valor * percentual / 100;
		System.out.println("Seu aumento ser� de"   +porcentagem+  "reais.");
		
		int total = valor + porcentagem;
		System.out.println("Seu novo sal�rio ser�"  +total+  "reais, parab�ns!");
		
	}
}	