import java.util.Scanner;

public class Questao8 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double primeiroLado, segundoLado, terceiroLado;

        System.out.println("Para saber o tipo do triangulo,\n");
        System.out.println("Digite o comprimento do primeiro lado");
        primeiroLado = scanner.nextDouble();
        System.out.println("Agora o comprimento do segundo lado:");
        segundoLado = scanner.nextDouble();
        System.out.println("E por último o comprimento do terceiro lado:");
        terceiroLado = scanner.nextDouble();

        if (primeiroLado+segundoLado>terceiroLado && primeiroLado+terceiroLado>segundoLado && segundoLado+terceiroLado>primeiroLado) {
          
            if (primeiroLado == segundoLado && segundoLado == terceiroLado) {
                System.out.println("O triângulo é equilátero.");
            } else if (primeiroLado == segundoLado || primeiroLado == segundoLado || segundoLado == terceiroLado) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Valor digitádos inválidos para triangulo!");
        }
        scanner.close(); 
    }

}
