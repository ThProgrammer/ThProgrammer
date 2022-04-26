package lista3;

import java.util.Scanner;

public class Lista3 {
    static int menorValor (int a, int b, int c) {
        int menor = a;

        if (b < menor) {
            menor = b;
        }

        if (c < menor){
            menor = c;
        }
        return menor;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Insira a: ");
        int a = input.nextInt();

        System.out.print("Insira b: ");
        int b = input.nextInt();

        System.out.print("Insira c: ");
        int c = input.nextInt();

        System.out.print(menorValor(a,b,c));
    }

}
