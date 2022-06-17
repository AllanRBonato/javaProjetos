package projetos.src;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner recebe = new Scanner(System.in);
        
        System.out.println("-------------------------\n");
        System.out.println("Por gentileza, digitar as informações a seguir.\n");
        System.out.println("-------------------------\n");
        System.out.print("Digite seu nome: ");
		String name = recebe.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = recebe.nextLine();
        System.out.print("Digite o dia de nascimento: ");
        int dia = recebe.nextInt();
        System.out.print("Digite o mês de seu nascimento: ");
        int mes = recebe.nextInt();
        System.out.print("Digite o ano de seu nascimento: \n");
        int ano = recebe.nextInt();
        
        System.out.println("-------------------------\n");

        final int anoAtual = 2022;
        int idade = anoAtual - ano;

        System.out.printf("O senhor: %S %S nascido no em: %d/%d/%d tem a idade de: %d.\n\n", name, sobrenome, dia, mes, ano, idade);
        
        System.out.println("-------------------------");
    }
}
