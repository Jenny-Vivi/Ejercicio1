import java.util.Scanner;

public class Seleccion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el tamanio del arreglo");
        int tamanio = teclado.nextInt();
        int[] numeros = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Ingresa los numeros  [" + i + "]");
            numeros[i] = teclado.nextInt();
        }

    }

}
