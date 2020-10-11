import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Todos os valores deverão ser números reais!");
        System.out.println("Digite o tamanho do lado A do retângulo em metros: ");
        Scanner base = new Scanner(System.in);
        int ladoA = base.nextInt();
        System.out.println("Lateral A possui " + ladoA + "m.");
        System.out.println("Digite o tamanho do lado B do retângulo em metros: ");
        Scanner altura = new Scanner(System.in);
        int ladoB  = altura.nextInt();
        System.out.println("Lateral B possui " + ladoB + "m.");

        int areaRetangulo = ladoA * ladoB;
        System.out.println("A area do retângulo é de: " + areaRetangulo + "m2.");
    }
}
