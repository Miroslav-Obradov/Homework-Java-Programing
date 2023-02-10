package DomaciRad;

import java.util.Scanner;

public class DomaciZadatak1 {
    public static void main(String[] args) {

        //Domaci zadaci:
        //1.Napraviti program gde cete uneti informacije o nekom vocu tako sto cete kreirati String za naziv nekog voca i double vrednost za njegovu cenu.
                //Uneti 4 naziva i 4 cene za odredjeno voce, i u svakom redu posebno stampati naziv vocke i njenu cenu za 30% snizenu.


        String voce1, voce2, voce3, voce4;
        double cenaVoca1, cenaVoca2, cenaVoca3, cenaVoca4;
        double smanjenaCenaVoca1, smanjenaCenaVoca2, smanjenaCenaVoca3, smanjenaCenaVoca4;
//----------------------------------------------------------------
        Scanner nazivSkenera = new Scanner(System.in);
//----------------------------------------------------------------
        System.out.println("Unesite naziv prvog voca:");
        voce1 = nazivSkenera.next();
        System.out.println("Unesite cenu prvog voca:");
        cenaVoca1 = nazivSkenera.nextDouble();
        System.out.println("Unesite naziv drugog voca:");
        voce2 = nazivSkenera.next();
        System.out.println("Unesite cenu drugog voca:");
        cenaVoca2 = nazivSkenera.nextDouble();
        System.out.println("Unesite naziv treceg voca:");
        voce3 = nazivSkenera.next();
        System.out.println("Unesite cenu treceg voca:");
        cenaVoca3 = nazivSkenera.nextDouble();
        System.out.println("Unesite naziv cetvrtog voca:");
        voce4 = nazivSkenera.next();
        System.out.println("Unesite cenu cetvrtog voca:");
        cenaVoca4 = nazivSkenera.nextDouble();
//-------------------------------------------------------------------
        smanjenaCenaVoca1 = cenaVoca1 - 30 * cenaVoca1 / 100;
        smanjenaCenaVoca2 = cenaVoca2 - 30 * cenaVoca2 / 100;
        smanjenaCenaVoca3 = cenaVoca3 - 30 * cenaVoca3 / 100;
        smanjenaCenaVoca4 = cenaVoca4 - 30 * cenaVoca4 / 100;
//-------------------------------------------------------------------
        System.out.println("Snizena cena voca: " + voce1 + " za 30% je: " + smanjenaCenaVoca1);
        System.out.println("Snizena cena voca: " + voce2 + " za 30% je: " + smanjenaCenaVoca2);
        System.out.println("Snizena cena voca: " + voce3 + " za 30% je: " + smanjenaCenaVoca3);
        System.out.println("Snizena cena voca: " + voce4 + " za 30% je: " + smanjenaCenaVoca4);
    }
}
