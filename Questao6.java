import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int estacaoEscolhida;

        System.out.println("Digite um dos numeros abaixo, e receba uma mensagem personalizada para a estação do ano escolhida!: ");
        System.out.println("1 Primavera ");
        System.out.println("2 Verão");
        System.out.println("3 Outono ");
        System.out.println("4 Inverno ");
        estacaoEscolhida = scanner.nextInt();

        switch (estacaoEscolhida){
            case 1:
            System.out.println("A primavera é o momento perfeito para florescermos, assim como as flores que se abrem para o sol.");
            break;
            
            case 2:
            System.out.println("No verão,\n" +
                               "Eu quero praia e sol, um lugar pra namorar \n" + 
                               "Até com chuva é bom, a gente pode conversar \n" +
                               "Eu quero praia e só, uma rede pra deitar.");
            break;

            case 3:
            System.out.println("Neste outono, permita-se ser como uma folha ao vento: livre, leve e pronta para uma nova jornada!");
            break;

            case 4:
            System.out.println("Que no seu inverno não falte calor!");
            break;

            default:
            System.out.println("Estação Invalida! Tente novamente!\n");
            main(args);
        }



        scanner.close(); 
    }
    
}
