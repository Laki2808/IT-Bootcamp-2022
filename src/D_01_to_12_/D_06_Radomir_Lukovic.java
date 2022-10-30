package D_01_to_12_;

import java.util.Scanner;

public class D_06_Radomir_Lukovic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        for (; true; ) {
            System.out.print("Unesite broj ili unesite 0 za izlaz: ");
            double broj = scanner.nextDouble();

            if (broj != 4) {
                sum = sum + Math.pow((Math.abs(broj)), 2);
            }
            if (broj == 4) {
                System.out.println("Broj 4 ne uzimamo u racunicu, unesite sledeci broj ili 0 za izlaz");
                continue;
            }
            if (broj == 0) {
                System.out.println("Izlazimo iz petlje");
                System.out.println("Suma kvadratnih vrednosti brojeva koje ste uneli je: " + sum);
                break;
            }
            System.out.println("Suma kvadratnih vrednosti brojeva koje ste uneli je: " + sum);
        }


    }
}
