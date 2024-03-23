import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        String descricaoProduto;
        double precoUnitario, quantidadeAdquirida, totalSemDesconto, totalComDesconto;

        System.out.println("Digite o nome do produto comprado:");
        descricaoProduto = scanner.nextLine();
        System.out.println("Agora digite a quantidade comprada:");
        quantidadeAdquirida = scanner.nextDouble();
        System.out.println("E por último, digite o preço pago por unidade:");
        precoUnitario = scanner.nextDouble();

        totalSemDesconto = quantidadeAdquirida*precoUnitario;

        if(quantidadeAdquirida<=5){
            System.out.println("Voce ganhou 2% de desconto no produto: "+descricaoProduto);
            System.out.println("O total do pedido foi: R$"+String.format("%.2f",totalSemDesconto));
            totalComDesconto = totalSemDesconto-(totalSemDesconto/100*2);
            System.out.println("Com o desconto recebido, o valor final ficará em : R$"+String.format("%.2f",totalComDesconto));
        
        }else if(quantidadeAdquirida>5&&quantidadeAdquirida<=10){
            System.out.println("Voce ganhou 3% de desconto no produto: "+descricaoProduto);
            System.out.println("O total do pedido foi: R$"+String.format("%.2f",totalSemDesconto));
            totalComDesconto = totalSemDesconto-(totalSemDesconto/100*3);
            System.out.println("Com o desconto recebido, o valor final ficará em : R$"+String.format("%.2f",totalComDesconto));
       
        }else if(quantidadeAdquirida>10&&quantidadeAdquirida<30){
            System.out.println("Voce ganhou 5% de desconto no produto: "+descricaoProduto);
            System.out.println("O total do pedido foi: R$"+String.format("%.2f",totalSemDesconto));
            totalComDesconto = totalSemDesconto-(totalSemDesconto/100*5);
            System.out.println("Com o desconto recebido, o valor final ficará em : R$"+String.format("%.2f",totalComDesconto));

        }else{
            System.out.println("Voce ganhou 10% de desconto no produto: "+descricaoProduto);
            System.out.println("O total do pedido foi: R$"+String.format("%.2f",totalSemDesconto));
            totalComDesconto = totalSemDesconto-(totalSemDesconto/100*10);
            System.out.println("Com o desconto recebido, o valor final ficará em : R$"+String.format("%.2f",totalComDesconto));
        }


        scanner.close(); 
    }
}
