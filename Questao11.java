import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoDigitada;
   
            System.out.println("Caixa Eletrônico Santander");
            System.out.println("Digite o número correspondente a operação que deseja realizar:");
            System.out.println("1 Exibir saldo");
            System.out.println("2 Exibir extrato");
            System.out.println("3 Realizar depósito");
            System.out.println("4 Realizar saque");
            System.out.println("5. Sair");
            opcaoDigitada = scanner.nextInt();

            switch (opcaoDigitada) {
                case 1:
                    System.out.println("Saldo atual: R$50,00");
                    break;
                case 2:
                    System.out.println("Para exibir extrato vc deve ter feito operações nos ultimos 30 dias!");
                    break;
                case 3:
                    System.out.println("A realização de depósitos está indisponível no momento.");
                    break;
                case 4:
                    System.out.println("Para Realizar saque, dirija-se até a boca do caixa!");
                    break;
                case 5:
                    System.out.println("Saindo. Obrigado por utilizar nosso banco!");
                    break;
                default:
                    System.out.println("Opção inválida! Finalizando atendimento!");
                    break;
            }

        scanner.close(); 
    }

}
