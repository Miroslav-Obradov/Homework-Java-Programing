package DomaciRad;

import java.util.Scanner;

public class DomaciZadatak9c {
    public static void main(String[] args) {
        //3. Napraviti program gde unosite 5 brojeva i uz poruku ispisati koji je bio najveci od svih njih.


        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        if (a > b && a > c && a > d && a > e)
            System.out.println("Najveci broj je: " + a);
        else if (b > c && b > d && b > e)
            System.out.println("Najveci broj je: " + b);
        else if (c > d && c > e)
            System.out.println("Najveci broj je: " + c);
        else if (d > e)
            System.out.println("Najveci broj je: " + d);
        else
            System.out.println("Najveci broj je: " + e);
    }
}


