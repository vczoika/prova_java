import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner roupa = new Scanner(System.in);
        System.out.println("Digite o valor da roupa em R$ (utilizar virgula para centavos): ");
        double valorRoupa = roupa.nextDouble();
        System.out.println("Preço da roupa é: R$" + valorRoupa);

        double novoValor = (valorRoupa * 10)/100;
        double valorFinal = valorRoupa - novoValor;

        if (verificarCupom() == true) {
            System.out.println("Sua peça de roupa acaba de ficar 10% mais barata!\n" +
                    "Novo valor: " + valorFinal);
        } else {
            System.out.println("Você não possui cupom, então sua roupa continua R$" + valorRoupa);
        }
    }

    public static boolean verificarCupom() {
        System.out.println("Você tem cupom?");
        Scanner verificarCupom = new Scanner(System.in);
        String cupom = verificarCupom.nextLine();

        if (cupom.equals("S") || cupom.equals("s")) {
            System.out.println("Tem cupom.");
            return true;
        } else if (cupom.equals("N") || cupom.equals("n")) {
            System.out.println("Não tem cupom.");
            return false;
        } else {
            System.out.println("Não é possivel verificar se possui cupom.");
            return false;
        }
    }


}
