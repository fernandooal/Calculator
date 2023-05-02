package calculadora;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double num1 = 0; double num2 = 0; int op = 0; double resultado = 1; int rep = 0;
		
		while(true) {
			System.out.println("Calculadora - Escolha a operação que quer realizar: ");
			System.out.println("0 - Fechar; \n1 - Adição; \n2 - Subtração; \n3 - Multiplicação; \n4 - Divisão; \n5 - Potenciação; \n6 - Fatorial.");
			op = scan.nextInt();
			
			cleanScreen();
			
			if(op == 6) {
				System.out.print("Escolha o número: ");
				num1 = scan.nextInt();
			} else if(op == 0){
				break;
			} else if(op == 5) {
				System.out.print("Escolha a base: ");
				num1 = scan.nextInt();
				System.out.print("Escolha o expoente: ");
				num2 = scan.nextInt();
			} else if(op > 6 || op < 0){
				System.out.println("Opção inválida!");
				break;
			} else {
				System.out.print("Escolha o primeiro número: ");
				num1 = scan.nextInt();
				System.out.print("Escolha o segundo número: ");
				num2 = scan.nextInt();
			}
			
			switch(op) {
				case 1:
					resultado = num1 + num2;
					break;
				case 2:
					if(num2 > num1) {
						resultado = ((num1 - num2) * -1);
					} else {
						resultado = (num1 - num2);
					}
					break;
				case 3:
					resultado = num1 * num2;
					break;
				case 4:
					if(num1 > num2) {
						resultado = num1/num2;
					} else {
						resultado = num2/num1;
					}
					break;
				case 5:
					resultado = (int) Math.pow(num1, num2);
					break;
				case 6: 
					for(int i = 1; i <= num1; i++) {
						resultado = resultado * i;
					}
				default:
					System.out.println("Opção inválida!");
					break;
			}
			
			cleanScreen();
			
			System.out.println("O seu resultado é: " + resultado);
			
			System.out.println("Você gostaria de continuar? \n0 - Não; \n1 - Sim.");
			rep = scan.nextInt();
			
			if(rep == 0) {
				cleanScreen();
				break;
			}
			
			cleanScreen();
		}
	}
	
	public static void cleanScreen() {
		for(int i = 0; i < 100; i++) {
			System.out.println();
		}
	}
	
}
