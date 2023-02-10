package DomaciRad;

import java.util.Scanner;

public class DomaciZadatak5 {
    public static void main(String[] args) {
//        1. Napisati program gde cete uneti velicinu majice: 24( Ispise: S velicina), 30cm(Ispise: M Velicina),
//        36cm (ispise: L velicina), 42cm(ispise: XL velicina) u suprotnom izbaciti gresku o nepostojecoj velicini.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite velicinu majice u cm");
        int velicina = sc.nextInt();

        switch (velicina) {
            case 24:
                System.out.println("S velicina");
                break;
            case 30:
                System.out.println("M velicina");
                break;
            case 36:
                System.out.println("L velicina");
                break;
            case 42:
                System.out.println("XL velicina");
                break;
            default:
                System.out.println("Uneli ste nepostojecu velicinu");
                break;

        }
    }
}
