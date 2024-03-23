import java.util.Scanner;

public class Questao10 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double custoProduto, precoVenda;

        System.out.println("Lojinha do Sr. Aboo");
        System.out.println("Para saber o percentual de lucro, e preço de venda do produto, digite o seu preço de custo:");
        custoProduto = scanner.nextDouble();

        if(custoProduto<10){
            System.out.println("Você tera 70% de lucro!");
            precoVenda = custoProduto+(custoProduto/100*70);
            System.out.println("Preço de venda: R$"+String.format("%.2f",precoVenda));
                   
        }else if(custoProduto>=10&&custoProduto<30){
            System.out.println("Você tera 50% de lucro!");
            precoVenda = custoProduto+(custoProduto/100*50);
            System.out.println("Preço de venda: R$"+String.format("%.2f",precoVenda));
       
        }else if(custoProduto>30&&custoProduto<50){
            System.out.println("Você tera 40% de lucro!");
            precoVenda = custoProduto+(custoProduto/100*40);
            System.out.println("Preço de venda: R$"+String.format("%.2f",precoVenda));

        }else{
            System.out.println("Você tera 30% de lucro!");
            precoVenda = custoProduto+(custoProduto/100*30);
            System.out.println("Preço de venda: R$"+String.format("%.2f",precoVenda));

        }


        scanner.close(); 
    }
}
