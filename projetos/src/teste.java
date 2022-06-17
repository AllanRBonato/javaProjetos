package projetos.src;

import java.util.Scanner;

public class teste {
    public static void main(String[] args){

        Scanner recebe = new Scanner(System.in);

        System.out.println("-----------------------------------------\n\n");
        System.out.println("Resultado de nota final.\n");
        System.out.println("-----------------------------------------\n\n");

        System.out.print("Digite o nome do aluno: ");
        String aluno = recebe.nextLine();
        System.out.print("Digite a primeira nota: ");
        float nota1 = recebe.nextInt();
        System.out.print("Digite a segunda nota: ");
        float nota2 = recebe.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float nota3 = recebe.nextFloat();

        float notaTotal = nota1 + nota2 + nota3;
        float media = (nota1 + nota2 + nota3) / 3;

        System.out.println("\n");

        System.out.printf("De acordo com as notas informadas, o aluno %S ficou com: %.2f na primeira nota, %.2f na segunda nota e com %.2f na terceira nota, somando o total de: %.2f.\n", aluno, nota1, nota2, nota3, notaTotal);
        
        System.out.println("\n");        

        String resultado = "";
        if(media >= 7){
            resultado = "O aluno passou!";
        }
        else{
            resultado = "O aluno esta na prova final!";
        }
        
        System.out.printf("A média do %S é de %.2f, com isso: %S ", aluno, media, resultado);

        System.out.println("\n");

        System.out.println("-----------------------------------------");

        recebe.close();
    }
}
