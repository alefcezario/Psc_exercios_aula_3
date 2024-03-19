import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);        
    double altura, peso,  imc;
        
    System.out.println("Para calcular seu IMC e saber qual a a sua situação, digite sua altura separada por virgula: ");
    altura = scanner.nextDouble();

    System.out.println("Agora digite o seu peso: ");
    peso = scanner.nextDouble();
    
    imc = peso/(altura*altura);

    System.out.println("Seu imc é: "+String.format("%.2f" ,imc));

    if (imc<20) {
    System.out.println("Você está abaixo do peso!");  

    }else if (imc>=20&&imc<25) {
    System.out.println("Seu peso está normal!");  

    }else if (imc>=25&&imc<30){
        System.out.println("Você está com sobrepeso!!");  
    }else if (imc>=30&&imc<40){
        System.out.println("Você está com Obeso!!"); 
    }else{
        System.out.println("Você está com Obeso Morbido!!"); 
    }
    scanner.close(); 

    }
}
