import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double primeiraNota, segundaNota, terceiraNota, mediaNotas;
        
        System.out.println("Pra calcular a média, digite a nota da sua 1ª avaliação: ");
        primeiraNota = scanner.nextDouble();
        
        System.out.println("Agora digite a nota da sua 2ª avaliação: ");
        segundaNota = scanner.nextDouble();
        
        System.out.println("E por ultimo, digite a nota da sua 3ª avaliação: ");
        terceiraNota = scanner.nextDouble();
        
        mediaNotas = (primeiraNota+segundaNota+terceiraNota)/3;
        System.out.println("Sua média de notas é: "+mediaNotas);
        
        if(mediaNotas>=7){
            System.out.println("Você foi aprovado! :-)");
        }else{
            System.out.println("Você foi reprovado! :-(");
        }
        
        scanner.close();
    }
}
