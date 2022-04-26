import java.util.Scanner;

public class main_execution {

	public static void main(String[] args) {
		
//		int x = 100;
//		double y = 200;
//		int a = 0;
//		double b = 0;
//		short z = (short) 100000;//Vai dar negativo por causa do sinal de magnitude//
//		
//		a = (int)y;//Casting explicito = passagem de uma variavel pra outra com possível perda de dados// 
//		b = x;//Casting implicito = passagem de uma variavel pra outra sem perda de dados//
//		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//		
//		int idadePessoa = 17;
//		
//		if (idadePessoa < 18) {
//			System.out.println("Você não pode dirigir");
//		}
//		else if (idadePessoa < 60) {
//			System.out.println("Bora tomar uma");
//		}
//		else {
//			System.out.println("Quanto é a sua aposentadoria?");
//		}
		
		
		
//		int num = 9;
//	switch (num) {
//		case 1:
//			System.out.println("Domingo");
//			break;              
//		case 2:                 
//			System.out.println("Segunda");
//			break;              
//		case 3:                   
//			System.out.println("Terça");
//			break;              
//		case 4:                  
//			System.out.println("Quarta");
//			break;              
//		case 5:                   
//			System.out.println("Quinta");
//			break;
//		case 6:                   
//			System.out.println("Sexta");
//			break;
//		case 7:                   
//			System.out.println("Sabado");
//			break;
//		default:
//			System.out.println("Esse número não representa um dia da semana");
//		}
		
	
//	char caractere = 'a';
//	
//	switch(caractere) {
//		case 'a':
//			System.out.println("Seu caractere é A");
//			break;
//		case 'b':
//			System.out.println("Seu caractere é B");
//			break;
//		default:
//			System.out.println("Valor invalido");
//	}
	
//	String farol = "verde";
//	
//	switch (farol) {
//		case "verde":
//			System.out.println("Siga");
//			break;
//		case "vermelho":
//			System.out.println("Pare");
//			break;
//		case "amarelo":
//			System.out.println("Atenção");
//			break;
//		default:
//			System.out.println("Cor inserida invalida");
//	}
		
//		int x = 0;
//		
//		while (x < 10) {
//			System.out.println(x);
//			x += 1;
//		}
		
//		int x = 11;//No (do while) ele sempre executa oq estiver no bloco (do), depois se for verdade a condição, ele executa novamente. 
//		do {
//			System.out.println(x);
//			x += 1;
//		}while(x < 10);
		
//		for (int x = 0; x < 10; x++) {//Estrutura for = for (escolha/criação de variavel;Condição;Incremento)
//			System.out.println(x);
//		}
		
		
//		for (int x = 1; x < 11; x += 1) {
//			System.out.println(x + " X " + x + " = " + x * 2);
//		}
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira o valor da tabuada");
		int y = leitor.nextInt();
		
		for (int x = 0; x < 11; x += 1) {
			System.out.println(x + " X " + y + " = " + x * y);
		}
		
		
		
	}

}
