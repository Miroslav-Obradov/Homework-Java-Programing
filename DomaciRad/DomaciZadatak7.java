package DomaciRad;

import java.util.Scanner;

public class DomaciZadatak7 {
    public static void main(String[] args) {
//        1. Napraviti program gde unosite neki broj i kao rezultat vracate njegov faktorijel.


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj za faktorijal");
        int broj = sc.nextInt();
        int faktorijal = 1;

        for (int i = 1; i <= broj; i++) {
            faktorijal = faktorijal * i;

        }
        System.out.println("Faktorijal broja " + broj + " je " + faktorijal);
        System.out.println("Kraj programa");
    }
}

