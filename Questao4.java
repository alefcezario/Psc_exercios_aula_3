import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        double salario;
        double taxaAumento1 = 1.1;
        double taxaAumento2 = 1.2;
        double taxaAumento3 = 1.3;

        //System.out.println(); linha desnecessária pois não imprime nada!
        System.out.println("Por favor, informe o valor do salário atual: ");
        salario = scanner.nextDouble();

        /*estrutura if corrigida com consições else if
        * para que seja execultada apenas a que atender a condição solicitada.
        */
        if(salario <= 1000) {
            salario *= taxaAumento3;
            //equivalente a salario = salario * 1.3
        }else if(salario <= 2000) {
            salario *= taxaAumento2;
        }else if(salario <= 3000) {
            salario *= taxaAumento1;
        }else if(salario <= 4000) {
            salario = (salario * taxaAumento1) + 200;
        }else{
            //adicionada uma ultima condição para o caso de salarios maiores de 4000 ele perguntar o salario novamente
            System.out.printf("Apenas salários menores que R$4000,00 terão aumento!\nDigite novamente o valor do salario abaixo: \n\n");
            main(args);
        }

        //System.out.println(); linha desnecessária pois não imprime nada!
        System.out.println("Novo Salário: R$ "+String.format("%.2f", salario));

        //entrada fechada para melhor finalização do programa
        scanner.close(); 
    }
      
}
