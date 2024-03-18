 import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double primeiroNumero, segundoNumero, resultadoDivisao;
        
        System.out.println("Digite o primeiro numero a da divisão: ");
        primeiroNumero = scanner.nextDouble();
        
        System.out.println("Digite o segundo número da divisão: ");
        segundoNumero = scanner.nextDouble();
        
        if(segundoNumero!=0){
            resultadoDivisao = primeiroNumero/segundoNumero;
            System.out.println("O resultado da sua divisão é: "+resultadoDivisao);
        }else{
            System.out.println("Você não pode dividir por 0 (zero)");
        }
        scanner.close();
    }
    
}
