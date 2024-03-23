import java.util.Scanner;

public class Questao9 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int idadeEleitor;
        
        System.out.println("Qua a sua idade?");
        idadeEleitor = scanner.nextInt();

        if(idadeEleitor<16){
            System.out.println("Não é eleitor");
                    
        }else if(idadeEleitor>=16&&idadeEleitor<=17){
            System.out.println("Eleitor facultativo");
                     
        }else if(idadeEleitor>=18&&idadeEleitor<=65){
            System.out.println("Eleitor obrigatório");

        }else{
            System.out.println("Eleitor facultativo");

        }
        scanner.close(); 
    }
}
