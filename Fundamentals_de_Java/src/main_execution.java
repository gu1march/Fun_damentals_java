import java.util.Scanner;

public class main_execution {

	public static void main(String[] args) {
		
		int x = 100;
		double y = 200;
		int a = 0;
		double b = 0;
		short z = (short) 100000;//Vai dar negativo por causa do sinal de magnitude//
		
		a = (int)y;//Casting explicito = passagem de uma variavel pra outra com possível perda de dados// 
		b = x;//Casting implicito = passagem de uma variavel pra outra sem perda de dados//
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		int idadePessoa = 17;
		
		if (idadePessoa < 18) {
			System.out.println("Você não pode dirigir");
		}
		else if (idadePessoa < 60) {
			System.out.println("Bora tomar uma");
		}
		else {
			System.out.println("Quanto é a sua aposentadoria?");
		}
		
		
		//LOOPS DE REPETIÇÃO//
		int num = 9;
	switch (num) {
		case 1:
			System.out.println("Domingo");
			break;              
		case 2:                 
			System.out.println("Segunda");
			break;              
		case 3:                   
			System.out.println("Terça");
			break;              
		case 4:                  
			System.out.println("Quarta");
			break;              
		case 5:                   
			System.out.println("Quinta");
			break;
		case 6:                   
			System.out.println("Sexta");
			break;
		case 7:                   
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Esse número não representa um dia da semana");
		}
		
	
	char caractere = 'a';
	
	switch(caractere) {
		case 'a':
			System.out.println("Seu caractere é A");
			break;
		case 'b':
			System.out.println("Seu caractere é B");
			break;
		default:
			System.out.println("Valor invalido");
	}
	
	String farol = "verde";
	
	switch (farol) {
		case "verde":
			System.out.println("Siga");
			break;
		case "vermelho":
			System.out.println("Pare");
			break;
		case "amarelo":
			System.out.println("Atenção");
			break;
		default:
			System.out.println("Cor inserida invalida");
	}
		
		int x = 0;
		//LOOP DE REPETIÇÃO//
		while (x < 10) {
			System.out.println(x);
			x += 1;
		}
		//LOOP DE REPETIÇÃO//
		int x = 11;//No (do while) ele sempre executa oq estiver no bloco (do), depois se for verdade a condição, ele executa novamente. 
		do {
			System.out.println(x);
			x += 1;
		}while(x < 10);
		
		for (int x = 0; x < 10; x++) {//Estrutura for = for (escolha/criação de variavel;Condição;Incremento)
			System.out.println(x);
		}
		
		//LOOP DE REPETIÇÃO//
		for (int x = 1; x < 11; x += 1) {
			System.out.println(x + " X " + x + " = " + x * 2);
		}
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira o valor da tabuada");
		int y = leitor.nextInt();
		
		for (int x = 0; x < 11; x += 1) {
			System.out.println(x + " X " + y + " = " + x * y);
		}
		
		//INTRODUÇÃO A ARRAYS//
		int x1 = 3 ;
		int y1 = 5 ;
		int z1 = 7 ;
		
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(z1);
		System.out.println();
		
		//ARRAY//
		//CRIAÇÃO DE ARRAYS COM NÚMERO DE POSIÇÕES INDEFINIDAS (SENDO DETERMINADA PELA QUANTIDADE DE VALORES ATRIBUIDOS)//
		double x[] = { 3, 5, 3, 5 };
		
		//X.LENGHT PEGA O NÚMERO DE VALORES DENTRO DA ARRAY OU MOSTRA QUANTOS VALORES ELA SUPORTA//
		for (int aux = 0; aux < x.length; aux++) {
		System.out.println("valor do indice" + aux + " = " + x[aux]);
		}
		String nome[] = {"Rafael", "Gislene", "Lara" };
		
		for (int aux1 = 0; aux1 < nome.length; aux1++) {
		System.out.println(nome[aux1]);
			if (nome[aux1] == "Gislene") {
				Sytem.out.println("O indice de Gislene é = " + aux1);
		}
		}
		
		//CRIAÇÃO DE ARRAYS COM NÚMERO DE POSIÇÕES JÁ DEFINIDAS//
		int[] arrayInt = new int[5];
		String[] ArrayString = new String[4];
		double [] ArrayDouble = new double[3];
		
		//ATRIBUIÇÃO DE VALOR PARA POSIÇÃO ESPECIFICA DA ARRAY//
		arrayInt[3] = 4;
		
		int [] numero = new int[6];
		Scanner teclado = new Scanner(System.in);
		
		for (int aux2 = 0; aux2 < numero.length; aux2++) {
		System.out.println("Digite um número qualquer");
			numero[aux2] = teclado.nextInt();
		}
		for (int aux2 = 0; aux2 < numero.length; aux2++) {
		System.out.println("Indice " + aux2 + " = " + numero[aux2]);
		}
		
		
		int[] arrayQualquer = new int[3];
		Object[] arrayObject = new Object[6];
		//Pegando da superclasse god Object é possível colocar qualquer coisa dentro da array de object, até outros objetos//
		//Na falta de atribuição de valor ele atribui null para a posição sem valor//
		
		arrayObject [0] = 12;
		arrayObject [1] = "Rafael";
		arrayObject [2] = 13.8;
		arrayObject [3] = true;
		arrayObject [5] = arrayQualquer;

		for (int aux2 = 0; aux2 < arrayObject.length;aux2++) {
			System.out.println("Indice " +aux2+ " = " + arrayObject[aux2]);
		}
		
		//O segundo [] serve para criar as colunas e o primeiro as linhas, sendo 4 linhas e 3 colunas//
		int [][] arrayBidirecional = new int[4][3];
		
		arrayBidirecional[0][0] = 8;
		arrayBidirecional[2][1] = 7;
		
		for (int linha = 0; linha < arrayBidirecional.length;linha++) {
			for (int coluna = 0; coluna < arrayBidirecional[0].length;coluna++) {
				System.out.print("Indice [" +linha+ "][" + coluna + "] = " + arrayBidirecional[linha][coluna] + " " );
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}
