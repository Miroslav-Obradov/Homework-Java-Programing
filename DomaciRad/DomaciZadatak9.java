package DomaciRad;

import java.util.Scanner;

public class DomaciZadatak9 {
    public static void main(String[] args) {

       // 3. Napraviti program gde unosite 5 brojeva i uz poruku ispisati koji je bio najveci od svih njih.

        Scanner sc = new Scanner(System.in);
        int najveci = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Unesite brojeve");
            int broj = sc.nextInt();
            if (najveci < broj) {
                najveci = broj;
            }
        }
        System.out.println("Najveci broj je " + najveci);
        System.out.println("Kraj programa");
    }
}


