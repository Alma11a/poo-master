import java.util.Scanner;

public class MainNumeroLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entre 0 y 9999: ");
        int numero = scanner.nextInt();
        scanner.close();

        System.out.println(numero + " en letras: " + NumeroLetras.separar(numero));

    }
}
