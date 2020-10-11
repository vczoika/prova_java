import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Restaurante ComaBem
        System.out.println("Digite o valor gasto do cliente em R$: ");
        Scanner valor = new Scanner(System.in);
        double valorCliente = valor.nextDouble();
        System.out.println("Valor gasto do cliente sem os 10%: R$" + valorCliente);
        double valorTotal = (valorCliente * 110) / 100; // 100% + 10%
        System.out.println("Valor total gasto do cliente + 10% do garçom: R$" + valorTotal);

    }
}
