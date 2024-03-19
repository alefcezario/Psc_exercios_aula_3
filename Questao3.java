import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
      double votosBrancos, votosNulos, votosValidos, totalEleitores;
      double percentualBrancos, percentualNulos, percentualValidos;
      
       System.out.println("Digite a quantidade de eleitores que votaram em branco:");
       votosBrancos = scanner.nextDouble();
       
       System.out.println("Agora digite a quantidade de eleitores que votaram nulo:");
       votosNulos = scanner.nextDouble();
       
       System.out.println("E por ultimo a quantidade de votos válidos:");
       votosValidos = scanner.nextDouble();
       
       totalEleitores = votosBrancos + votosNulos + votosValidos;
       percentualBrancos = votosBrancos/totalEleitores*100;
       percentualNulos = votosNulos/totalEleitores*100;
       percentualValidos = votosValidos/totalEleitores*100;
       
       System.out.println("O total de eleitores é: "+totalEleitores);
       System.out.println(percentualBrancos+"% dos eleitores votaram em branco.");
       System.out.println(percentualNulos+"% dos eleitores anularam seu voto.");
       System.out.println(percentualValidos+"% dos votos foram validos!");
              
       scanner.close();     
    }

}
