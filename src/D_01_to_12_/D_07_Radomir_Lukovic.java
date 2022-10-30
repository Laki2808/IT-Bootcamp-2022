package D_01_to_12_;

import java.util.Scanner;

public class D_07_Radomir_Lukovic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite duzinu niza: ");
        int duzinaNiza = scanner.nextInt();
        String[] imena = new String[duzinaNiza];

        for (int i = 0; i < duzinaNiza; i++) {

            System.out.print("Unesite ime: ");
            imena[i] = scanner.next();
        }

        System.out.println("Imena koja pocinju sa M su:");

        for (int i = 0; i < duzinaNiza; i++) {

            if (imena[i].charAt(0) == ('M') || imena[i].charAt(0) == ('m')) {

                System.out.println(imena[i]);
            }
        }


    }
}
